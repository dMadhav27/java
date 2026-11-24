public class Java_24_11_2026_Q3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean identity = true;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matrix[i][j] != 1) {
                    identity = false;
                } else if (i != j && matrix[i][j] != 0) {
                    identity = false;
                }
            }
        }

        if (identity) {
            System.out.println("Identity matrix");
        } else {
            System.out.println("Not an identity matrix");
        }
    }
}