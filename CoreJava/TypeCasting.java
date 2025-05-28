package CoreJava;

public class TypeCasting {
    public static void main(String args[]){

        // Type Casting
        double myDouble = 9.78;
        int myIntFromDouble = (int) myDouble;
        System.out.println("Original double: " + myDouble);
        System.out.println("After casting to int: " + myIntFromDouble);

        // Int to double (Implicit casting)
        int myInt = 25;
        double myDoubleFromInt = myInt;
        System.out.println("Original int: " + myInt);
        System.out.println("After casting to double: " + myDoubleFromInt);
    }
}
