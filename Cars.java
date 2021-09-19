public class Cars {
    private String brand;
    private String model;
    private int hp;
    private String owner;
    private String power;
    public void properties () {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(hp);
        System.out.println(owner);
        System.out.println(power);
    }
    //Constructor
    public Cars (String brand, String model, int hp, String owner, String power) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        this.owner = owner;
        this.power = power;
    }
    public static void main (String [] args) {
        Cars mercedesGL3502014 = new Cars ("Mercedes","GL 350 Bluetech", 240, "Akshay Madan", "diesel");
        Cars hondaAccord2013 = new Cars ("Honda", "Accord",232, "Abha Kapoor","Gasoline");
        hondaAccord2013.properties();
    }
}
//Create Class Plane and create 2 planes
