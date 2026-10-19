
import java.util.Scanner;

public class Java_19_10_2026_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid units");
        } else {
            int bill;

            if (units <= 100) {
                bill = units * 2;
            } else if (units <= 200) {
                bill = 200 + (units - 100) * 3;
            } else {
                bill = 500 + (units - 200) * 5;
            }

            System.out.println("Electricity bill: Rs. " + bill);
        }

        sc.close();
    }
}
