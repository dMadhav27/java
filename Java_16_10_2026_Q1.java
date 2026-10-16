
import java.util.Scanner;

public class Java_16_10_2026_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Invalid input");
        } else if (num == 0) {
            System.out.println("Binary: 0");
        } else {
            String binary = "";

            while (num > 0) {
                binary = (num % 2) + binary;
                num /= 2;
            }

            System.out.println("Binary: " + binary);
        }

        sc.close();
    }
}
