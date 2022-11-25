import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderFactory {
    static Order order1=new Order("25-11-2022","15:06",5,true,OrderStatus.NEW,orderDishes(),orderDrinks(),30.50);
    static Order order2=new Order("25-11-2022","15:10",6,true,OrderStatus.NEW,orderDishes(),orderDrinks(),200.50);
    static Order order3=new Order("25-11-2022", "15:30", 4, true, OrderStatus.NEW, orderDishes(),orderDrinks(), 30.50);
    public static List<Dish> orderDishes() {
        List<Dish> orderDishes = new ArrayList<>();
        orderDishes.add(MenuFactory.dish1);
        orderDishes.add(MenuFactory.dish3);
        orderDishes.add(MenuFactory.dish6);
        return orderDishes;
    }

    public static List<Drink> orderDrinks() {
        List<Drink> orderDrinks = new ArrayList<>();
        orderDrinks.add(MenuFactory.drink1);
        orderDrinks.add(MenuFactory.drink4);
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

    public static Order createAnOrder() {
        Order order=null;
            Scanner scan = new Scanner(System.in);
            System.out.println("Date: ");
            order.setDate(scan.nextLine());
            System.out.println("Time: ");
            order.setTimeOfCreation(scan.nextLine());
            System.out.println("Table number: ");
           order.setTable(new Table(scan.nextInt(), false));
            order.setOrderStatus(OrderStatus.NEW);
           orderDishes();
            orderDrinks();
            order.setTotalSum(calculateTotalSum(orderDishes(), orderDrinks()));
            return order;
            }
    public static List<Order> createListOfOrders(){
        List <Order> listOfOrders=new ArrayList<>();
        listOfOrders.add(order1);
        listOfOrders.add(order2);
        listOfOrders.add(order3);
        listOfOrders.add(createAnOrder());
        return listOfOrders;
        }
    public static boolean validateAnOrder(Order order) {
        if (order.getTable().isTableFree()== true) {
            System.out.println("Table is free for guests.");
            return true;
        } else {
            System.out.println("Table is not free.");
            return false;
        }
    }
}
