
import java.util.Scanner;

public class Java_14_10_2026_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        if (exponent < 0) {
            System.out.println("Exponent must be non-negative");
        } else {
            long result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }

            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
