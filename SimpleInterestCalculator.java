import java.util.Scanner;
public class SimpleInterestCalculator {
    public static double calculateInterest(double principal, int years, boolean isSeniorCitizen) {
        double rateOfInterest;
        
        if (isSeniorCitizen) {
            rateOfInterest = 12.0;
        } else {
            rateOfInterest = 10.0; 
        }

        return (principal * rateOfInterest * years) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        System.out.print("Is customer senior citizen (y/n): ");
        char seniorCitizenInput = scanner.next().charAt(0);
        boolean isSeniorCitizen = (seniorCitizenInput == 'y' || seniorCitizenInput == 'Y');
        double interest = calculateInterest(principal, years, isSeniorCitizen);
        System.out.println("Interest: " + interest);

        scanner.close();
    }
}
