# MineSweeper Game
This is a text-based MineSweeper game implemented in Java. The game is played on a 2D array and is designed within the MineSweeper class.

## Rules of the Game
The game is text-based.
It is played on a 2D array, and the game logic is implemented in the MineSweeper class.
The user can choose the size of the matrix (number of rows and columns).
The number of mines in the game is set to one-fourth of the total number of elements in the array (rows * columns).
The user selects a point on the grid by providing row and column values.
The program checks if the selected point is within the valid boundaries of the array, and if not, it requests a valid point from the user.
If the user selects a point containing a mine, the game is lost.
If the selected point does not contain a mine, the program reveals the surrounding cells and indicates the number of adjacent mines for each cell. If no mines are adjacent, a "0" value is shown.
The user wins the game by selecting all the cells without hitting any mines.
## How to Play
Compile the Java code and run the program.
Upon running, the game will prompt you to enter the number of rows and columns for the grid.
After entering the grid size, the game will start, and you will see the initial board with cells represented by "-" characters.
You will be asked to enter the row and column values to select a cell on the grid.
If the selected cell contains a mine, you lose the game, and it will show "Game Over!!".
If the cell does not contain a mine, it will reveal the number of adjacent mines or "0" if there are no adjacent mines.
Keep selecting cells without mines until you reveal all the non-mine cells to win the game.
