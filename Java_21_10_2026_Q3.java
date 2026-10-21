public class Java_21_10_2026_Q3 {
    public static void main(String[] args) {
        int n = 2345;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            n /= 10;
        }

        System.out.println("Product of digits: " + product);
    }
}