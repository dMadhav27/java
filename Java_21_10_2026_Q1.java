public class Java_21_10_2026_Q1 {
    public static void main(String[] args) {
        int[] arr = {14, 5, 29, 8, 17};

        int largest = arr[0];
        int smallest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Difference: " + (largest - smallest));
    }
}