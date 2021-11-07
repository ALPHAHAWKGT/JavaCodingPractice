public class Bike extends Vehicle {
    public static void main (String [] args) {
        Bike bike = new Bike ();
        bike.move ();
    }

    public void move () {
        System.out.println("Move from Child Class");
    }
}
