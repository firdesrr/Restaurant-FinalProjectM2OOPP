import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("************************************************");
        System.out.println("***Restaurant service information system***");
        System.out.println("************************************************");
        System.out.println();
        System.out.println("Enter your position (steward or cook): ");
        String position = scan.nextLine();


        Dish dish1 = new Dish("Shopska salata", 8.50, "appetizer");
        Dish dish2 = new Dish("Ovcharska salata", 10.50, "appetizer");
        Dish dish3 = new Dish("Kebabcheta s garnitura", 12.50, "main course");
        Dish dish4 = new Dish("Kyufteta po chirpanski", 11.50, "main course");
        Dish dish5 = new Dish("Domashna torta", 4.50, "dessert");
        Dish dish6 = new Dish("Krem karamel", 3.50, "dessert");
        ArrayList<Dish> dishes = new ArrayList<Dish>();
        dishes.add(dish1);
        dishes.add(dish2);
        dishes.add(dish3);
        dishes.add(dish4);
        dishes.add(dish5);
        dishes.add(dish6);

        Drink drink1 = new Drink("Rakia", 3.6, "alcoholic");
        Drink drink2 = new Drink("Wine", 2.6, "alcoholic");
        Drink drink3 = new Drink("Coca-cola", 2.1, "non-alcoholic");
        Drink drink4 = new Drink("Ayryan", 1.5, "non-alcoholic");
        Drink drink5 = new Drink("Tea", 1.2, "hot drink");
        Drink drink6 = new Drink("Hot chocolate", 1.8, "hot drink");
        List<Drink> drinks = new ArrayList<>();
        drinks.add(drink1);
        drinks.add(drink2);
        drinks.add(drink3);
        drinks.add(drink4);
        drinks.add(drink5);
        drinks.add(drink6);

        MenuOfDishesAndDrinks menu = new MenuOfDishesAndDrinks(dishes, drinks);
        System.out.println( menu);
    }
}