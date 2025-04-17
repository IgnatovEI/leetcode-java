#!/bin/bash

README="README.md"
SOLUTIONS_TABLE="solutions.md"
SRC_DIR="src"

count_problems() {
    local difficulty="$1"
    find "$SRC_DIR/$difficulty" -name '_*.java' | wc -l | tr -d ' '
}

EASY=$(count_problems "easy")
MEDIUM=$(count_problems "medium")
HARD=$(count_problems "hard")
TOTAL=$((EASY + MEDIUM + HARD))

cat > "$README" <<EOF
# LeetCode Solutions (Java)

📊 **Progress**:
✅ **Total Solved**: $TOTAL
🟢 Easy: $EASY | 🟡 Medium: $MEDIUM | 🔴 Hard: $HARD

## Solutions Table
[View all solutions]($SOLUTIONS_TABLE)

## Usage
\`\`\`bash
./update_stats.sh
\`\`\`
EOF

echo "| # | Problem | Difficulty | Solution |" > "$SOLUTIONS_TABLE"
echo "|---|---------|------------|----------|" >> "$SOLUTIONS_TABLE"

find "$SRC_DIR" -name '_*.java' | while read -r file; do
    num=$(basename "$file" | cut -d'_' -f2 | cut -d'.' -f1)
    name=$(basename "$file" | cut -d'_' -f3- | sed 's/.java//')
    diff=$(echo "$file" | cut -d'/' -f2)
    echo "| $num | $name | $diff | [Java]($file) |" >> "$SOLUTIONS_TABLE"
done

echo "✅ README and solutions table updated!"