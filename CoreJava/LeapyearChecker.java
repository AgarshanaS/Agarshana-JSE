package CoreJava;

import java.util.Scanner;

public class LeapyearChecker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Leap Year Checker
        System.out.print("Enter a year");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}
