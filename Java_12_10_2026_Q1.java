
import java.util.Scanner;

public class Java_12_10_2026_Q1 {

    static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        System.out.println("Sum of digits: " + sumOfDigits(num));

        sc.close();
    }
}
