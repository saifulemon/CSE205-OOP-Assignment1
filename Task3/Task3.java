import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the year
        int year = scanner.nextInt();

        // Check if it's a leap year
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // Century year: must be divisible by 400
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                // Divisible by 4 but not by 100
                isLeapYear = true;
            }
        }

        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        scanner.close();
    }
}
