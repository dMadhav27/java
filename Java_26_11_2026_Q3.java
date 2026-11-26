public class Java_26_11_2026_Q3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        boolean symmetric = true;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }

            if (!symmetric) {
                break;
            }
        }

        if (symmetric) {
            System.out.println("Symmetric matrix");
        } else {
            System.out.println("Not a symmetric matrix");
        }
    }
}