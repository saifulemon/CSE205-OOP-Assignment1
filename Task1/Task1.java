import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read student ID
        int studentId = scanner.nextInt();

        // Extract the last two digits
        int lastDigit = studentId % 10;
        int secondLastDigit = (studentId / 10) % 10;

        // Print in reverse order (rightmost first)
        System.out.println(lastDigit);
        System.out.println(secondLastDigit);

        scanner.close();
    }
}
