public class Java_23_11_2026_Q2 {
    public static void main(String[] args) {
        String str = "appleZ";

        char maximum = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > maximum) {
                maximum = str.charAt(i);
            }
        }

        System.out.println("Character: " + maximum);
        System.out.println("ASCII value: " + (int) maximum);
    }
}