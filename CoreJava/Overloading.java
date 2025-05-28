package CoreJava;

public class Overloading {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        Overloading obj = new Overloading();
        int twoint = obj.add(2,3);
        double twodouble = obj.add(5.0,4.0);
        int threeint = obj.add(2,3,4);
        System.out.println(twoint);
        System.out.println(twodouble);
        System.out.println(threeint);
    }
}
