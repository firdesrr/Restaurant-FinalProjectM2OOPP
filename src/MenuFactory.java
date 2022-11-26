import java.util.ArrayList;
import java.util.List;

public class MenuFactory {
    public static Menu createMenu() {
        Dish dish1 = new Dish("Shopska salata", 8.50, TypeOfDish.APPETIZER);
        Dish dish2 = new Dish("Ovcharska salata", 10.50, TypeOfDish.APPETIZER);
        Dish dish3 = new Dish("Kebabcheta s garnitura", 12.50, TypeOfDish.MAIN_COURSE);
        Dish dish4 = new Dish("Kyufteta po chirpanski", 11.50, TypeOfDish.MAIN_COURSE);
        Dish dish5 = new Dish("Domashna torta", 4.50, TypeOfDish.DESSERT);
        Dish dish6 = new Dish("Krem karamel", 3.50, TypeOfDish.DESSERT);

        Drink drink1 = new Drink("Rakia", 3.6, TypeOfDrink.ALCOHOLIC);
        Drink drink2 = new Drink("Wine", 2.6, TypeOfDrink.ALCOHOLIC);
        Drink drink3 = new Drink("Coca-cola", 2.1, TypeOfDrink.NON_ALCOHOLIC);
        Drink drink4 = new Drink("Ayryan", 1.5, TypeOfDrink.NON_ALCOHOLIC);
        Drink drink5 = new Drink("Tea", 1.2, TypeOfDrink.HOT_DRINK);
        Drink drink6 = new Drink("Hot chocolate", 1.8, TypeOfDrink.HOT_DRINK);

        List<Dish> dishes = new ArrayList<>();
        List<Drink> drinks = new ArrayList<>();

        dishes.add(dish1);
        dishes.add(dish2);
        dishes.add(dish3);
        dishes.add(dish4);
        dishes.add(dish5);
        dishes.add(dish6);

        drinks.add(drink1);
        drinks.add(drink2);
        drinks.add(drink3);
        drinks.add(drink4);
        drinks.add(drink5);
        drinks.add(drink6);

        Menu menu = new Menu(dishes, drinks);
        return menu;
    }
}
