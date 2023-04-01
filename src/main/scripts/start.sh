#!/user/bin/env sh

# game tic-tac-toe in console-mode

cd "$(dirname "$0")" || exit

java -jar ${project.build.finalName}.jar
echo "press Enter to continue..."
read -r test