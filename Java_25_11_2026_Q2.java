public class Java_25_11_2026_Q2 {
    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "program";

        int i = 0;

        while (i < str1.length() && i < str2.length()
                && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }

        String prefix = str1.substring(0, i);

        System.out.println("Common prefix: " + prefix);
    }
}