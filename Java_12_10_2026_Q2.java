
public class Java_12_10_2026_Q2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number: " + missing);
    }
}
