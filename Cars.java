public class Cars {
    private String brand;
    private String model;
    private int hp;
    private String owner;
    public void properties () {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(hp);
        System.out.println(owner);
    }
    //Constructor
    public Cars (String brand, String model, int hp, String owner) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        this.owner = owner;
    }
    public static void main (String [] args) {
        Cars mercedesGL350 = new Cars ("Mercedes","GL 350 Bluetech", 240, "Akshay Madan");
        Cars hondaAccord2013 = new Cars ("Honda", "Accord",232, "Abha Kapoor");
        hondaAccord2013.properties();
    }
}
