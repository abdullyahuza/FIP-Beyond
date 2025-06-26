import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();

        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println("Reversed String: " + reversed);

        scanner.close();
    }
}
