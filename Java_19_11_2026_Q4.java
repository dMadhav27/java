class Java_19_11_2026_Q4 {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        boolean result = false;

        if (str1.length() == str2.length()) {
            String combined = str1 + str1;

            if (combined.contains(str2)) {
                result = true;
            }
        }

        System.out.println(
            result ? "Strings are rotations" :
                     "Strings are not rotations"
        );
    }
}