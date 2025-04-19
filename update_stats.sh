#!/bin/bash

README="README.md"
SOLUTIONS_TABLE="solutions.md"
SRC_DIR="src"

count_problems() {
    local difficulty="$1"
    find "$SRC_DIR/$difficulty" -name '_*.java' | wc -l | tr -d ' '
}

get_recent_solutions() {
    find "$SRC_DIR" -name '_*.java' -printf '%T@ %p\n' |
    sort -nr |
    cut -d' ' -f2- |
    head -3 |
    while read -r file; do
        num=$(basename "$file" | cut -d'_' -f2 | cut -d'.' -f1)
        name=$(basename "$file" | cut -d'_' -f3- | sed 's/.java//')
        diff=$(echo "$file" | cut -d'/' -f2)
        echo "- [$num. $name ($diff)]($file)"
    done
}

EASY=$(count_problems "easy")
MEDIUM=$(count_problems "medium")
HARD=$(count_problems "hard")
TOTAL=$((EASY + MEDIUM + HARD))
RECENT_SOLUTIONS=$(get_recent_solutions)

cat > "$README" <<EOF
## LeetCode Solutions (Java)

📊 **Progress**:
✅ **Total Solved**: $TOTAL
- 🟢 Easy: $EASY
- 🟡 Medium: $MEDIUM
- 🔴 Hard: $HARD

## Recently Solved
$RECENT_SOLUTIONS

## All Solutions
[View complete solutions table]($SOLUTIONS_TABLE)
EOF

{
    echo "| # | Problem | Difficulty | Solution |"
    echo "|---|---------|------------|----------|"
    find "$SRC_DIR" -name '_*.java' | sort -V | while read -r file; do
        num=$(basename "$file" | cut -d'_' -f2 | cut -d'.' -f1)
        name=$(basename "$file" | cut -d'_' -f3- | sed 's/.java//')
        diff=$(echo "$file" | cut -d'/' -f2)
        echo "| $num | $name | $diff | [Java]($file) |"
    done
} > "$SOLUTIONS_TABLE"