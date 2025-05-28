package CoreJava;

import java.util.Scanner;

public class ArrayCalculation {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n=scanner.nextInt();
        int sum = 0;
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
        System.out.println(sum);

        scanner.close();
    }
    
}
