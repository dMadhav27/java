public class Java_19_11_2026_Q3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 4, 6},
            {8, 1, 3},
            {5, 7, 9}
        };

        int maxSum = Integer.MIN_VALUE;
        int rowNumber = -1;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                rowNumber = i;
            }
        }

        System.out.println("Row: " + (rowNumber + 1));
        System.out.println("Maximum sum: " + maxSum);
    }
}