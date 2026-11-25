public class Java_25_11_2026_Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};

        int totalSum = 0;
        int leftSum = 0;
        int index = -1;

        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                index = i;
                break;
            }

            leftSum += arr[i];
        }

        System.out.println("Equilibrium index: " + index);
    }
}