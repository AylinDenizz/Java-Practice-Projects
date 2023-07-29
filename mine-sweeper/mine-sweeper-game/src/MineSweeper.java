import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int rows;
    private int cols;
    private char[][] board;
    private boolean[][] mines;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        board = new char[rows][cols];
        mines = new boolean[rows][cols];
        initializeBoard();
        placeMines();
    }

    public void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void placeMines() {
        int totalMines = rows * cols / 4;
        Random random = new Random();
        for (int i = 0; i < totalMines; i++) {
            int randRow, randCol;
            do {
                randRow = random.nextInt(rows);
                randCol = random.nextInt(cols);
            } while (mines[randRow][randCol]);
            mines[randRow][randCol] = true;
        }
    }

    public boolean isValid(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public int countAdjacentMines(int row, int col) {
        int count = 0;
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int newRow = row + dr[i];
            int newCol = col + dc[i];
            if (isValid(newRow, newCol) && mines[newRow][newCol]) {
                count++;
            }
        }

        return count;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int remainingCells = rows * cols - countMines();

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");

        while (true) {
            System.out.println("===========================");
            printBoard();

            System.out.print("Satır Giriniz : ");
            int row = scanner.nextInt();

            System.out.print("Sütun Giriniz : ");
            int col = scanner.nextInt();

            if (!isValid(row, col)) {
                System.out.println("Geçersiz bir nokta girdiniz. Lütfen tekrar deneyin.");
                continue;
            }

            if (mines[row][col]) {
                System.out.println("Game Over!!");
                break;
            }

            if (board[row][col] != '-') {
                System.out.println("Bu noktayı daha önce seçtiniz. Lütfen başka bir nokta seçin.");
                continue;
            }

            int adjacentMines = countAdjacentMines(row, col);
            board[row][col] = (char) (adjacentMines + '0');

            remainingCells--;
            if (remainingCells == 0) {
                System.out.println("Oyunu Kazandınız!");
                printBoard();
                break;
            }
        }

        scanner.close();
    }

    private int countMines() {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mines[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}