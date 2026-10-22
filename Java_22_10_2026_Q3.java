public class Java_22_10_2026_Q3 {
    public static void main(String[] args) {
        String str = "room24number";
        char result = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                result = ch;
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First digit: " + result);
        } else {
            System.out.println("No digit found");
        }
    }
}