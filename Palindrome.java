import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            if (isPalindrome(inputString)) {
                System.out.println("The input string is a palindrome.");
            } else {
                System.out.println("The input string is not a palindrome.");
            }

            System.out.print("Do you want to check another string? (y/n): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Exiting the program.");
        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
