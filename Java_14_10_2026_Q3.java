
public class Java_14_10_2026_Q3 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 7, 2, 9, 7};

        System.out.print("Distinct elements: ");

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }
}
