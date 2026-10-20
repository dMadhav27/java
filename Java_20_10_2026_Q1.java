
import java.util.Scanner;

public class Java_20_10_2026_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term: ");
        double a = sc.nextDouble();

        System.out.print("Enter common ratio: ");
        double r = sc.nextDouble();

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of terms must be positive");
        } else {
            double term = a;
            double sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += term;
                term *= r;
            }

            System.out.println("Sum: " + sum);
        }

        sc.close();
    }
}

