public class Java_23_10_2026_Q1 {
    public static void main(String[] args) {
        int[] arr = {12, 25, 8, 31, 25, 40};
        int target = 31;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }
}