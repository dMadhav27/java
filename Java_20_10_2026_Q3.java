
public class Java_20_10_2026_Q3 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 7, 9, 12};

        boolean sorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
