public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposeOfMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeOfMatrix[j][i] = matrix[i][j];
            }

        }
        // Print the transpose matrix
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeOfMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

    }
}
