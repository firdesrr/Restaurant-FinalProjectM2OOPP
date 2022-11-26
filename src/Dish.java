import java.util.Scanner;

public class Dish {
    private String name;
    private double price;
    private TypeOfDish type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TypeOfDish getType() {
        return type;
    }

    public void setType(TypeOfDish type) {
        this.type = type;
    }

    public Dish(String name, double priceOfDish, TypeOfDish typeOfDish) {
        this.name = name;
        this.price = priceOfDish;
        this.type = typeOfDish;
    }
public static Dish addADishToMenu(){
        Dish dish = null;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a dish name: ");
    dish.setName(scan.nextLine());
    System.out.println( );
    System.out.println("Enter a dish price: ");
    dish.setPrice(scan.nextDouble());
    System.out.println("Enter a dish type:\n   APPETIZER,\n" +
            "    MAIN_COURSE,\n" +
            "    DESSERT,: ");
    dish.setType(TypeOfDish.valueOf(scan.nextLine().toUpperCase()));
    return dish;
}
     @Override
    public String toString() {
        return "\nDish details:" +
                "\nname->" + name +
                "\nprice->" + price +
                "\ntype->" + type +'\n';
    }
}
