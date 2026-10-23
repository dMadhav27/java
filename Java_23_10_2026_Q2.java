public class Java_23_10_2026_Q2 {
    public static void main(String[] args) {
        String sentence = "  Java   makes coding easier  ";
        String trimmed = sentence.trim();

        int count = 0;

        if (!trimmed.isEmpty()) {
            String[] words = trimmed.split("\\s+");
            count = words.length;
        }

        System.out.println("Word count: " + count);
    }
}