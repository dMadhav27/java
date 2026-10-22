public class Java_22_10_2026_Q2 {
    public static void main(String[] args) {
        String str = "learn java every day";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println(result);
    }
}