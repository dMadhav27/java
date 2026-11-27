public class Java_27_11_2026_Q1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7, 4, 6, 9, 3};

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 != arr[i - 1] % 2) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println("Longest alternating length: " + maxCount);
    }
}