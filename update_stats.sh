#!/bin/bash

# === 📁 Путь к файлам ===
README="README.md"
SOLUTIONS_TABLE="solutions.md"
SRC_DIR="src"

# === 📊 Подсчёт задач по сложности ===
count_problems() {
    local level="$1"
    find "$SRC_DIR/$level" -type f -name '_*.java' | wc -l | tr -d ' '
}

# === 🕒 Получение последних 3 решённых задач ===
get_recent_solutions() {
    find "$SRC_DIR" -type f -name '_*.java' -printf '%T@ %p\n' |  # timestamp + путь
    sort -nr |                                                    # по времени убыв
    head -3 |                                                     # берём 3 новых
    awk '{ $1=""; sub(/^ /, ""); print }' |                       # удаляем timestamp
    while read -r file; do
        filename="${file##*/}"                                    # _1_TwoSum.java
        difficulty="${file#${SRC_DIR}/}"                          # easy/medium/hard/...
        difficulty="${difficulty%%/*}"

        # Извлекаем номер и имя задачи из имени файла
        num="${filename%%_*}"         # пусто — из-за начального _
        rest="${filename#_}"          # убрали начальное подчеркивание → "1_TwoSum.java"
        num="${rest%%_*}"             # берём до следующего "_" → "1"
        name="${rest#*_}"             # всё после "_" → "TwoSum.java"
        name="${name%.java}"          # убираем расширение → "TwoSum"

        echo "- [$num. $name ($difficulty)]($file)"
    done
}

# === 📈 Статистика ===
EASY=$(count_problems "easy")
MEDIUM=$(count_problems "medium")
HARD=$(count_problems "hard")
TOTAL=$((EASY + MEDIUM + HARD))
RECENT_SOLUTIONS="$(get_recent_solutions)"

# === 📄 README.md ===
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

# === 📋 Генерация таблицы решений (solutions.md) ===
{
    echo "| # | Problem | Difficulty | Solution |"
    echo "|---|---------|------------|----------|"

    find "$SRC_DIR" -type f -name '_*.java' | sort -V | while read -r file; do
        filename="${file##*/}"              # _1_TwoSum.java
        difficulty="${file#${SRC_DIR}/}"
        difficulty="${difficulty%%/*}"

        rest="${filename#_}"                # "1_TwoSum.java"
        num="${rest%%_*}"                   # "1"
        name="${rest#*_}"                   # "TwoSum.java"
        name="${name%.java}"                # "TwoSum"

        echo "| $num | $name | $difficulty | [Java]($file) |"
    done
} > "$SOLUTIONS_TABLE"
