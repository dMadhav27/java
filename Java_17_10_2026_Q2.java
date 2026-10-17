
import java.util.Scanner;

public class Java_17_10_2026_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Reversed sentence: ");
        } else {
            String[] words = sentence.split("\\s+");
            StringBuilder result = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                result.append(words[i]);

                if (i > 0) {
                    result.append(" ");
                }
            }

            System.out.println("Reversed sentence: " + result);
        }

        sc.close();
    }
}
