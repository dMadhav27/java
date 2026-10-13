
import java.util.Arrays;
import java.util.Scanner;

public class Java_13_10_2026_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().replace(" ", "").toLowerCase();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().replace(" ", "").toLowerCase();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }

        sc.close();
    }
}
