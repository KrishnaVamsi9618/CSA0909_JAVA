import java.util.Scanner;
public class LCMandGCD {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.print("Enter number 1: ");
        int number = scanner.nextInt();
        int currentGCD = number;
        int currentLCM = number;
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            number = scanner.nextInt();
            currentGCD = gcd(currentGCD, number);
            currentLCM = lcm(currentLCM, number);
        }
        System.out.println("GCD = " + currentGCD);
        System.out.println("LCM = " + currentLCM);
        
        scanner.close();
    }
}
