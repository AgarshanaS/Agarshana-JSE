package CoreJava;

import java.util.Scanner;

public class StringReversal {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String input=scanner.nextLine();

        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        System.out.println("Reversed string: " + reversed.toString());

        scanner.close();
    }
}
