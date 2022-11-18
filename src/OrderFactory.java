import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderFactory {

    public static List<Dish> orderDishes() {
        List<Dish> orderDishes = new ArrayList<>();
        Dish dish1 = new Dish("Shopska salata", 8.50, TypeOfDish.APPETIZER);
        Dish dish2 = new Dish("Ovcharska salata", 10.50, TypeOfDish.APPETIZER);
        Dish dish3 = new Dish("Kebabcheta s garnitura", 12.50, TypeOfDish.MAIN_COURSE);
        Dish dish4 = new Dish("Kyufteta po chirpanski", 11.50, TypeOfDish.MAIN_COURSE);
        Dish dish5 = new Dish("Domashna torta", 4.50, TypeOfDish.DESSERT);
        Dish dish6 = new Dish("Krem karamel", 3.50, TypeOfDish.DESSERT);
        orderDishes.add(dish1);
        orderDishes.add(dish2);
        orderDishes.add(dish3);
        orderDishes.add(dish4);
        orderDishes.add(dish5);
        orderDishes.add(dish6);
        return orderDishes;
    }

    public static List<Drink> orderDrinks() {
        List<Drink> orderDrinks = new ArrayList<>();
        Drink drink1 = new Drink("Rakia", 3.6, TypeOfDrink.ALCOHOLIC);
        Drink drink2 = new Drink("Wine", 2.6, TypeOfDrink.ALCOHOLIC);
        Drink drink3 = new Drink("Coca-cola", 2.1, TypeOfDrink.NON_ALCOHOLIC);
        Drink drink4 = new Drink("Ayryan", 1.5, TypeOfDrink.NON_ALCOHOLIC);
        Drink drink5 = new Drink("Tea", 1.2, TypeOfDrink.HOT_DRINK);
        Drink drink6 = new Drink("Hot chocolate", 1.8, TypeOfDrink.HOT_DRINK);
        orderDrinks.add(drink1);
        orderDrinks.add(drink2);
        orderDrinks.add(drink3);
        orderDrinks.add(drink4);
        orderDrinks.add(drink5);
        orderDrinks.add(drink6);
        return orderDrinks;
    }

    public static double calculateTotalSum(List<Dish> orderDishes, List<Drink> orderDrinks) {
        double totalSum = 0.0;
        for (Dish dish : orderDishes) {
            totalSum += dish.getPriceOfDish();
        }
        for (Drink drink : orderDrinks) {
            totalSum += drink.getPriceOfDrink();
        }
        return totalSum;
    }

    public static Order createAnOrder(Order order) {
        if (validateAnOrder(order)) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Date: ");
            order.setDate(scan.nextLine());
            System.out.println("Time: ");
            order.setTimeOfCreation(scan.nextLine());
            System.out.println("Table number: ");
            order.setTableNumber(scan.nextInt());
            order.setOrderStatus(OrderStatus.NEW);
            orderDishes();
            orderDrinks();
            order.setTotalSum(calculateTotalSum(orderDishes(), orderDrinks()));
            order.setTableFree(false);
            return order;
        } else return null;
    }

    public static boolean validateAnOrder(Order order) {
        if (order.isTableFree() == true) {
            System.out.println("Table is free for guests.");
            return true;
        } else {
            System.out.println("Table is not free.");
            return false;
        }
    }
}
