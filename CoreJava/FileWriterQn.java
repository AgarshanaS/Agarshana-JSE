package CoreJava;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterQn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(userInput);
            writer.close();
            System.out.println("Data has been written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        scanner.close();
    }
}
