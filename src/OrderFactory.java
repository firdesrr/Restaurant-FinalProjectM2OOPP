import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrderFactory {

    public static Order createAnOrder() {
        boolean isAnother;
        Order order = new Order();
        Scanner scan = new Scanner(System.in);
        order.setDate(LocalDate.now());
        order.setTimeOfCreation(LocalTime.now());
        System.out.println("Table number: ");
        int tableN = scan.nextInt();
        order.setTable(new Table(tableN,false));
        order.setOrderStatus(OrderStatus.NEW);

        do {
            Dish dish=Dish.createDish();
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
        scan.close();
        return order;
    }

    public static boolean validateAnOrder(Order order) {
        if (order.getTable().isTableFree()) {
            System.out.println("Table is free for guests.");
            return true;
        } else {
            System.out.println("Table is not free.");
            return false;
        }
    }
}
