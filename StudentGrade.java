import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[4];
        String[] subjects = {"Python", "C Programming", "Mathematics", "Physics"};

        double total = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the marks in " + subjects[i] + ": ");
            
            if (scanner.hasNextDouble()) {
                marks[i] = scanner.nextDouble();
                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println("Invalid marks. Marks should be between 0 and 100.");
                    return;
                }

                total += marks[i];
            } else {
                System.out.println("Invalid input. Please enter valid marks.");
                return;
            }
        }

        double aggregate = total / 4;
        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);

        if (aggregate >= 75) {
            System.out.println("Grade: DISTINCTION");
        } else if (aggregate >= 60) {
            System.out.println("Grade: FIRST DIVISION");
        } else if (aggregate >= 50) {
            System.out.println("Grade: SECOND DIVISION");
        } else if (aggregate >= 40) {
            System.out.println("Grade: THIRD DIVISION");
        } else {
            System.out.println("Grade: FAIL");
        }
    }
}
