package CoreJava;

import java.util.Scanner;

public class Fibonacci {
    //Fibonacci
    public int fibonacci(int n){
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();

        // Fibonacci
        Fibonacci obj = new Fibonacci();
        int result = obj.fibonacci(num);
        System.out.println(result);
        scanner.close();
    }
}
