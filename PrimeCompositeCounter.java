import java.util.Scanner;
public class PrimeCompositeCounter {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeCount = 0, compositeCount = 0;
        System.out.println("Enter numbers (enter any non-numeric input to stop):");
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (number > 1) {
                if (isPrime(number)) {
                    primeCount++;
                } else {
                    compositeCount++;
                }
            }
        }
        System.out.println("Composite numbers: " + compositeCount);
        System.out.println("Prime numbers: " + primeCount);
    }
}
