
public class Java_19_10_2026_Q2 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 4};
        int[] b = {4, 8, 10, 12, 8};

        System.out.print("Common elements: ");

        for (int i = 0; i < a.length; i++) {
            boolean found = false;

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (a[k] == a[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (found && !alreadyPrinted) {
                System.out.print(a[i] + " ");
            }
        }

        System.out.println();
    }
}
