public class Java_20_10_2026_Q6 {
    public static void main(String[] args) {
        int n = 49;
        boolean isPerfectSquare = false;

        for (int i = 0; i <= n / (i == 0 ? 1 : i); i++) {
            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
            if (i * i > n) {
                break;
            }
        }

        System.out.println(
            isPerfectSquare ? "Perfect square" : "Not a perfect square"
        );
    }
}