
import java.util.Scanner;

public class Java_20_10_2026_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("No words found");
        } else {
            String[] words = sentence.split("\\s+");
            String longest = words[0];

            for (int i = 1; i < words.length; i++) {
                if (words[i].length() > longest.length()) {
                    longest = words[i];
                }
            }

            System.out.println("Longest word: " + longest);
            System.out.println("Length: " + longest.length());
        }

        sc.close();
    }
}
