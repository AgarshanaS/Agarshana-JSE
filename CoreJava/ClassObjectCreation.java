package CoreJava;

class Car{
    // Attributes
    String make;
    String model;
    int year;

    // Constructor to initialize attributes
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
}
public class ClassObjectCreation {
    public static void main(String args[]){
    Car car1 = new Car("Toyota", "Corolla", 2020);
    Car car2 = new Car("Honda", "Civic", 2018);

    car1.displayDetails();
    System.out.println();  // Just to add a blank line
    car2.displayDetails();
    }
}
