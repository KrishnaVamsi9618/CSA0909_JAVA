import java.util.Arrays;
import java.util.Scanner;
public class MthMaxNthMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of M (for Mth maximum): ");
        int M = scanner.nextInt();
        System.out.print("Enter the value of N (for Nth minimum): ");
        int N = scanner.nextInt();
        Arrays.sort(array);
        if (M > 0 && M <= size && N > 0 && N <= size) {
            int MthMax = array[size - M];
            int NthMin = array[N - 1];
            System.out.println(M + "th Maximum Number = " + MthMax);
            System.out.println(N + "th Minimum Number = " + NthMin);
            int sum = MthMax + NthMin;
            int difference = MthMax - NthMin;
            
            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + difference);
        } else {
            System.out.println("Invalid M or N. Please enter valid values.");
        }
    }
}
