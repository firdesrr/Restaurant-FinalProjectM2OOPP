import java.util.Scanner;

public class Drink {
    private String name;
    private double price;
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static Drink addADrinkToMenu(){
        Drink drink = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a dish name: ");
        String dishName=scan.nextLine();
        drink.setName(dishName);
        scan.nextLine();
        System.out.println("Enter a dish price: ");
        drink.setPrice(scan.nextDouble());
        System.out.println("Enter a dish type: ");
        String type=scan.nextLine().toUpperCase();
        drink.setType(type);
        scan.close();
        return drink;

    }
    public Drink(String nameOfDrink, double price, String typeOfDrink) {
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
