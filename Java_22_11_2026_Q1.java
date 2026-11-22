public class Java_22_11_2026_Q1 {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 9, 2};

        int minValue = arr[0];
        int maxDifference = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int difference = arr[i] - minValue;

            if (difference > maxDifference) {
                maxDifference = difference;
            }

            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.println("Maximum difference: " + maxDifference);
    }
}