public class Overloading {
    public static void main (String [] args) {
        Overloading overloadingObject = new Overloading();
        //Integers
        System.out.println (overloadingObject.multiply(3,4));
        //Doubles
        System.out.println (overloadingObject.multiply(3.5,4));
    }
    public int multiply (int a, int b) {
        return a*b;
    }
    public double multiply (double a, double b) {
        return a*b;
    }
}
