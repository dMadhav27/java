public class Java_20_10_2026_Q4 {
    public static void main(String[] args) {
        int[] arr = {5, -3, 0, 8, -2, 0, 4};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeros: " + zero);
    }
}