public class Java_27_11_2026_Q3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean found = false;

        for (int i = 0; i < rows; i++) {
            int minCol = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            int value = matrix[i][minCol];
            boolean largest = true;

            for (int k = 0; k < rows; k++) {
                if (matrix[k][minCol] > value) {
                    largest = false;
                    break;
                }
            }

            if (largest) {
                System.out.println("Saddle point: " + value);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No saddle point found");
        }
    }
}