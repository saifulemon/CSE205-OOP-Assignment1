import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input string
        String input = scanner.nextLine();

        // Build output string with previous alphabet
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Get previous character
            // 'a' wraps around to 'z'
            if (currentChar == 'a') {
                output.append('z');
            } else {
                output.append((char) (currentChar - 1));
            }
        }

        // Print the result
        System.out.println(output.toString());

        scanner.close();
    }
}
