import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrderFactory {

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

    public static Order createAnOrder() {
        boolean isAnother = true;
        Order order = null;
        Scanner scan = new Scanner(System.in);

        System.out.println("Date: ");
        order.setDate(scan.nextLine());
        System.out.println("Time: ");
        order.setTimeOfCreation(scan.nextLine());
        System.out.println("Table number: ");
        order.setTable(new Table(scan.nextInt(), false));
        order.setOrderStatus(OrderStatus.NEW);
        do {
            Dish dish=Dish.addADish();
            order.setDishes(Collections.singletonList(dish));
            System.out.println("Do yo have another dish?");
            isAnother = scan.nextBoolean();
            order.setTotalSum(order.getTotalSum()+dish.getPriceOfDish());
        }
        while (isAnother);
        do {
            Drink drink=Drink.addADrink();
            order.setDrinks(Collections.singletonList(drink));
            System.out.println("Do yo have another drink?");
            isAnother = scan.nextBoolean();
            order.setTotalSum(order.getTotalSum()+drink.getPriceOfDrink());
        }
        while (isAnother);
        return order;
    }

    public static List<Order> createListOfOrders() {
        List<Order> listOfOrders = new ArrayList<>();
        listOfOrders.add(createAnOrder());
        return listOfOrders;
    }

    public static boolean validateAnOrder(Order order) {
        if (order.getTable().isTableFree() == true) {
            System.out.println("Table is free for guests.");
            return true;
        } else {
            System.out.println("Table is not free.");
            return false;
        }
    }
}
