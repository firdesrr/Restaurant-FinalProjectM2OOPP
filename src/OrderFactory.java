import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrderFactory {

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
            Dish dish=Dish.addADishToMenu();
            order.setDishes(Collections.singletonList(dish));
            System.out.println("Do yo have another dish?");
            isAnother = scan.nextBoolean();
            order.setTotalSum(order.getTotalSum()+dish.getPrice());
        }
        while (isAnother);
        do {
            Drink drink=Drink.addADrinkToMenu();
            order.setDrinks(Collections.singletonList(drink));
            System.out.println("Do yo have another drink?");
            isAnother = scan.nextBoolean();
            order.setTotalSum(order.getTotalSum()+drink.getPrice());
        }
        while (isAnother);
        return order;
    }

    public static List<Order> addOrderToList(List listOfOrders) {
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
