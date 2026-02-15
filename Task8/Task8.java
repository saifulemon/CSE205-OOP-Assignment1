import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input string
        String input = scanner.nextLine();

        // Remove consecutive duplicates
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Add character if it's the first character or different from the previous one
            if (i == 0 || currentChar != input.charAt(i - 1)) {
                output.append(currentChar);
            }
        }

        // Print the result
        System.out.println(output.toString());

        scanner.close();
    }
}
