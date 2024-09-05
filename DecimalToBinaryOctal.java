import java.util.Scanner;
public class DecimalToBinaryOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal;
        if (scanner.hasNextInt()) {
            decimal = scanner.nextInt();
            String binary = Integer.toBinaryString(decimal);
            String octal = Integer.toOctalString(decimal);
            System.out.println("Binary Number = " + binary);
            System.out.println("Octal Number = " + octal);
        } else {
            System.out.println("Invalid input. Please enter a valid decimal number.");
        }
    }
}