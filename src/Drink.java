import java.util.Scanner;

public class Drink {
    private String name;
    private double price;
    private TypeOfDrink type;

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

    public TypeOfDrink getType() {
        return type;
    }

    public void setType(TypeOfDrink type) {
        this.type = type;
    }

    public static Drink addADrinkToMenu(){
        Drink drink = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a dish name: ");
        drink.setName(scan.nextLine());
        System.out.println("Enter a dish price: ");
        drink.setPrice(scan.nextDouble());
        System.out.println("Enter a dish type: ");
        drink.setType(TypeOfDrink.valueOf(scan.nextLine().toUpperCase()));
        return drink;
    }
    public Drink(String nameOfDrink, double price, TypeOfDrink typeOfDrink) {
        this.name = nameOfDrink;
        this.price = price;
        this.type = typeOfDrink;
    }

    @Override
    public String toString() {
        return "\nDrink details:" +
               "\nname->" + name +
                "\nprice->" + price +
                "\ntype->"+ type +'\n';
    }
}
