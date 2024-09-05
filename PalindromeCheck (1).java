import java.util.Scanner;
public class PalindromeCheck {
    public static boolean isStringPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
    public static boolean isNumberPalindrome(int num) {
        int original = num, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to check string palindrome, 2 to check number palindrome:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter the string: ");
            scanner.nextLine();
            String inputString = scanner.nextLine();
            if (isStringPalindrome(inputString)) {
                System.out.println("The given string is a palindrome.");
            } else {
                System.out.println("The given string is not a palindrome.");
            }
        } else if (choice == 2) {
            System.out.print("Enter the number: ");
            int inputNumber = scanner.nextInt();
            if (isNumberPalindrome(inputNumber)) {
                System.out.println("The given number is a palindrome.");
            } else {
                System.out.println("The given number is not a palindrome.");
            }
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }
    }
}
