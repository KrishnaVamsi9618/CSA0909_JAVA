import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade of the employee (A/B): ");
        char grade = scanner.next().charAt(0);
        System.out.print("Enter the employee salary: ");
        double salary;
        if (scanner.hasNextDouble()) {
            salary = scanner.nextDouble();
            if (salary < 0) {
                System.out.println("Invalid input. Salary cannot be negative.");
                return;
            }
            double bonus = 0;
            if (grade == 'A') {
                bonus = 0.05 * salary;
            } else if (grade == 'B') {
                bonus = 0.10 * salary;
            } else {
                System.out.println("Invalid grade. Please enter A or B.");
                return;
            }
            if (salary < 10000) {
                bonus += 0.02 * salary;
            }
            double totalSalary = salary + bonus;
            System.out.println("Salary = " + salary);
            System.out.println("Bonus = " + bonus);
            System.out.println("Total to be paid = " + totalSalary);
        } else {
            System.out.println("Invalid input. Please enter a valid salary.");
        }
    }
}