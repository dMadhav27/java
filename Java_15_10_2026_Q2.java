
import java.util.Scanner;

public class Java_15_10_2026_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = Math.abs(sc.nextInt());

        System.out.print("Enter second number: ");
        int b = Math.abs(sc.nextInt());

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        System.out.println("GCD: " + a);

        sc.close();
    }
}
