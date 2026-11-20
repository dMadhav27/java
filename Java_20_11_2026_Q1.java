public class Java_20_11_2026_Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4, 6, 2, 8};

        int current = 1;
        int longest = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                current++;
            } else {
                current = 1;
            }

            if (current > longest) {
                longest = current;
            }
        }

        System.out.println("Longest increasing length: " + longest);
    }
}