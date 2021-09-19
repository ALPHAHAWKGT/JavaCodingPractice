public class Plane {
    private int numberOfEngines;
    private String model;
    private double wingspanInMeters;
    private String typeOfFuel;

    public void properties() {
        System.out.println(numberOfEngines);
        System.out.println(model);
        System.out.println(wingspanInMeters);
        System.out.println(typeOfFuel);
    }

    //Constructor
    public Plane(int numberOfEngines, String model, double wingspanInMeters, String typeOfFuel) {
        this.numberOfEngines = numberOfEngines;
        this.model = model;
        this.wingspanInMeters = wingspanInMeters;
        this.typeOfFuel = typeOfFuel;
    }

    public static void main(String[] args) {
        Plane airbusA380 = new Plane(4, "A380", 78.9, "60% Kerosine and 40% Gas to Liquid Fuel");
        Plane boeing747 = new Plane(4, "747", 232, "60% Kerosine and 40% Gas to Liquid Fuel");
        boeing747.properties();
    }
}