public class Java_26_11_2026_Q2 {
    public static void main(String[] args) {
        String str = "PROGRAM";

        int length = str.length();

        if (length % 2 == 0) {
            System.out.println(
                "Middle characters: " +
                str.charAt(length / 2 - 1) +
                str.charAt(length / 2)
            );
        } else {
            System.out.println(
                "Middle character: " +
                str.charAt(length / 2)
            );
        }
    }
}