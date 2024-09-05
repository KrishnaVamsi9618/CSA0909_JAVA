import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominations = {2000, 500, 200, 100};
        int[] notes = new int[4];
        for (int i = 0; i < denominations.length; i++) {
            System.out.println("Enter the number of " + denominations[i] + " notes: ");
            notes[i] = scanner.nextInt();
        }
        int totalAmount = 0;
        for (int i = 0; i < denominations.length; i++) {
            totalAmount += denominations[i] * notes[i];
        }
        System.out.println("Total available balance in the ATM: " + totalAmount);
    }
}
