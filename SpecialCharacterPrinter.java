import java.util.Scanner;

public class SpecialCharacterPrinter {
    public static void printSpecialCharacters(String sentence) {
        System.out.println("Special characters in the sentence are:");
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        printSpecialCharacters(sentence);

        scanner.close();
    }
}
