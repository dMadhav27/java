public class Java_09_10_2026_Q2 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 25, 18};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second-largest distinct element");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}