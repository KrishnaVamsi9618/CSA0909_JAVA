import java.util.Scanner;
public class VowelsAndConsonantsSeparator {
    public static void separateVowelsAndConsonants(String sentence) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.append(ch).append(" ");
            } 
            else if (ch >= 'a' && ch <= 'z') {
                consonants.append(ch).append(" ");
            }
        }
        System.out.println("Vowels: " + vowels.toString());
        System.out.println("Consonants: " + consonants.toString());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        separateVowelsAndConsonants(sentence);
        scanner.close();
    }
}
