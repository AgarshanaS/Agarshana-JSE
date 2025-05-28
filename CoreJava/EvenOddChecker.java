package CoreJava;
import java.util.*;

public class EvenOddChecker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        scanner.close();
    }
}
