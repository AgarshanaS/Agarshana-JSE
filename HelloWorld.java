import java.util.*;

class Calculation{
    // public int add(int a,int b){
    //     return a+b;
    // }
    // public double add(double a,double b){
    //     return a+b;
    // }
    // public int add(int a,int b, int c){
    //     return a+b+c;
    // }

    //Fibonacci
    public int fibonacci(int n){
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        // Even or Odd Checker
        System.out.println("Enter a Number");
        int num = scanner.nextInt();
        // // if(num%2==0){
        // // System.out.println("Even");
        // // }
        // // else{
        // // System.out.println("Odd");
        // // }

        // // //Leap Year Checker
        // // System.out.print("Enter a year: ");
        // // int year = scanner.nextInt();

        // // if (year % 4 == 0) {
        // // if (year % 100 == 0) {
        // // if (year % 400 == 0) {
        // // System.out.println(year + " is a leap year.");
        // // } else {
        // // System.out.println(year + " is not a leap year.");
        // // }
        // // } else {
        // // System.out.println(year + " is a leap year.");
        // // }
        // // } else {
        // // System.out.println(year + " is not a leap year.");
        // // }

        // //Multiplication Table
        // // for(int i=1;i<=10;i++){
        // // System.out.println(i+" * "+num+" = "+ i*num);
        // // }

        // // Data Type
        // int myInt = 25;
        // float myFloat = 10.5f;
        // double myDouble = 99.99;
        // char myChar = 'A';
        // boolean myBoolean = true;

        // System.out.println("Integer value: " + myInt);
        // System.out.println("Float value: " + myFloat);
        // System.out.println("Double value: " + myDouble);
        // System.out.println("Character value: " + myChar);
        // System.out.println("Boolean value: " + myBoolean);

        // Type Casting
        // double myDouble = 9.78;
        // int myIntFromDouble = (int) myDouble;
        // System.out.println("Original double: " + myDouble);
        // System.out.println("After casting to int: " + myIntFromDouble);

        // // Int to double (Implicit casting)
        // int myInt = 25;
        // double myDoubleFromInt = myInt;
        // System.out.println("Original int: " + myInt);
        // System.out.println("After casting to double: " + myDoubleFromInt);

        // Operator Precedence
        // System.out.println(5*4/2+2);

        // //Grade calculator
        // // System.out.print("Enter marks out of 100: ");
        // // int marks = scanner.nextInt();

        // // if (marks >= 90 && marks <= 100) {
        // // System.out.println("Grade: A");
        // // } else if (marks >= 80 && marks <= 89) {
        // // System.out.println("Grade: B");
        // // } else if (marks >= 70 && marks <= 79) {
        // // System.out.println("Grade: C");
        // // } else if (marks >= 60 && marks <= 69) {
        // // System.out.println("Grade: D");
        // // } else if (marks >= 0 && marks < 60) {
        // // System.out.println("Grade: F");
        // // } else {
        // // System.out.println("Invalid input. Please enter marks between 0 and
        // 100.");
        // // }

        // //Guessing Game
        // Random random = new Random();

        // int targetNumber = random.nextInt(100) + 1; // Generates number between 1 and
        // 100
        // int guess = 0;

        // System.out.println("Guess a number between 1 and 100:");

        // while (guess != targetNumber) {
        // System.out.print("Enter your guess: ");
        // guess = scanner.nextInt();

        // if (guess < targetNumber) {
        // System.out.println("Too low! Try again.");
        // } else if (guess > targetNumber) {
        // System.out.println("Too high! Try again.");
        // } else {
        // System.out.println("Congratulations! You guessed the correct number.");
        // }
        // }

        // Factorial Calculation
        // int factorial = 1;
        // if (num == 1 || num == 0) {
        //     System.out.println(factorial);
        // } else {
        //     for (int i = 1; i <= num; i++) {
        //         factorial *= i;
        //     }
        //     System.out.println(factorial);
        // }

        // Method Overloading
        Calculation cal = new Calculation();
        // int twoint = cal.add(2,3);
        // double twodouble = cal.add(5.0,4.0);
        // int threeint = cal.add(2,3,4);
        // System.out.println(twoint);
        // System.out.println(twodouble);
        // System.out.println(threeint);

        //Fibonacci
        int result = cal.fibonacci(num);
        System.out.println(result);
        scanner.close();
    }
}