public class Java_22_11_2026_Q3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 4, 6},
            {1, 3, 5},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + ": " + sum);
        }
    }
}