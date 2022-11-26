import java.util.List;
import java.util.Scanner;

public class Dish {
    private String name;
    private double priceOfDish;
    private TypeOfDish typeOfDish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceOfDish() {
        return priceOfDish;
    }

    public void setPriceOfDish(double priceOfDish) {
        this.priceOfDish = priceOfDish;
    }

    public TypeOfDish getTypeOfDish() {
        return typeOfDish;
    }

    public void setTypeOfDish(TypeOfDish typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public Dish(String name, double priceOfDish, TypeOfDish typeOfDish) {
        this.name = name;
        this.priceOfDish = priceOfDish;
        this.typeOfDish = typeOfDish;
    }
public static Dish addADish(){
        Dish dish = null;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a dish name: ");
    dish.setName(scan.nextLine());
    System.out.println("Enter a dish price: ");
    dish.setPriceOfDish(scan.nextDouble());
    System.out.println("Enter a dish type: ");
    dish.setTypeOfDish(TypeOfDish.valueOf(scan.nextLine().toUpperCase()));
    return dish;
}

     @Override
    public String toString() {
        return "\nDish details:" +
                "\nname->" + name +
                "\nprice->" + priceOfDish +
                "\ntype->" + typeOfDish+'\n';
    }
}
