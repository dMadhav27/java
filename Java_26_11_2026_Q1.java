public class Java_26_11_2026_Q1 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 8, 4};

        int maxProduct = arr[0] * arr[1];

        for (int i = 1; i < arr.length - 1; i++) {
            int product = arr[i] * arr[i + 1];

            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        System.out.println("Maximum product: " + maxProduct);
    }
}