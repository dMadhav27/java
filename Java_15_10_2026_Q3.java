
import java.util.Scanner;

public class Java_15_10_2026_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper = true;
            } else if (Character.isLowerCase(ch)) {
                lower = true;
            } else if (Character.isDigit(ch)) {
                digit = true;
            }
        }

        if (password.length() >= 8 && upper && lower && digit) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

        sc.close();
    }
}
