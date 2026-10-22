public class Java_22_10_2026_Q1 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 7, 9, 7, 3};
        int target = 7;
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}