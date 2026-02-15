import java.util.Scanner;

public class Task6SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size
        int n = scanner.nextInt();

        // Print square pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
