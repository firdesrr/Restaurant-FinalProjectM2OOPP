import java.util.Scanner;

public class Dish {
    private String name;
    private double price;
    private String type;//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            this.name = name;
        } catch (NullPointerException e ){
            System.out.println(  e.toString());
                   }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public Dish(String name, double priceOfDish, String typeOfDish) {
        this.name = name;
        this.price = priceOfDish;
        this.type = typeOfDish;
    }
public static Dish createDish(){
        Dish dish = new Dish();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a dish name: ");
   String dishName=scan.nextLine();

    dish.setName(dishName);
     System.out.println("Enter a dish price: ");
    scan.nextLine();
     double price=scan.nextDouble();
     dish.setPrice(price);
    System.out.println("Enter a dish type:\n   APPETIZER,\n" +
            "    MAIN_COURSE,\n" +
            "    DESSERT,: ");
    String type= scan.nextLine().toUpperCase();
    dish.setType(type);
    scan.close();
    return dish;
}

    public Dish() {
    }

    @Override
    public String toString() {
        return "\nDish details:" +
                "\nname->" + name +
                "\nprice->" + price +
                "\ntype->" + type +'\n';
    }
}
