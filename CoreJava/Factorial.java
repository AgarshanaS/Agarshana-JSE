package CoreJava;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();

        // Factorial Calculation
        int factorial = 1;
        if (num == 1 || num == 0) {
            System.out.println(factorial);
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
        scanner.close();
    }
}
