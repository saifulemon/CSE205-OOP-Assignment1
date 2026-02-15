import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Read 10 numbers in a loop
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();

            sum += num;

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        // Calculate average
        double average = sum / 10.0;

        // Print results
        System.out.println("Sum = " + sum);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + average);

        scanner.close();
    }
}
