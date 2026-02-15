import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read CGPA and credits
        double cgpa = scanner.nextDouble();
        int credits = scanner.nextInt();

        // Check eligibility
        if (credits >= 30 && cgpa >= 3.80) {
            // Determine waiver percentage based on CGPA
            int waiverPercentage;

            if (cgpa == 4.00) {
                waiverPercentage = 100;
            } else if (cgpa >= 3.95) {
                waiverPercentage = 75;
            } else if (cgpa >= 3.90) {
                waiverPercentage = 50;
            } else {
                waiverPercentage = 25;
            }

            System.out.println("The student is eligible for a waiver of " + waiverPercentage + " percent");
        } else {
            System.out.println("The student is not eligible for a waiver");
        }

        scanner.close();
    }
}
