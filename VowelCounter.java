import java.util.Scanner;

public class VowelCounter {

    public static int countVowels(String statement) {
        int vowelCount = 0;
        statement = statement.toLowerCase();
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine();
        int numberOfVowels = countVowels(statement);
        System.out.println("The number of vowels in the statement is: " + numberOfVowels);

        scanner.close();
    }
}
