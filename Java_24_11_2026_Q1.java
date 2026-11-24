public class Java_24_11_2026_Q1 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 5, 5, 3, 3, 3, 3, 1};

        int count = 1;
        int maxCount = 1;
        int element = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                element = arr[i];
            }
        }

        System.out.println("Element: " + element);
        System.out.println("Longest consecutive count: " + maxCount);
    }
}
