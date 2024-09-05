import java.util.Scanner;
public class PerfectNumbers {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }
            System.out.print("First " + n + " perfect numbers are: ");
            int count = 0, num = 1;
            while (count < n) {
                if (isPerfect(num)) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
