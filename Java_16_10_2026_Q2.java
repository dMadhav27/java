
public class Java_16_10_2026_Q2 {
    public static void main(String[] args) {
        int[] numbers = {12, 18, 25, 15, 30};

        if (numbers.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
