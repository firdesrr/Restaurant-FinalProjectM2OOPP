import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Steward extends Еmployee {
    private double dailyIncome;
    private Menu menu = MenuFactory.createMenu();
    private List<Order> orders=new ArrayList<>();


    public double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    @Override
    public void showPossibleActions() {
        //actions for steward

        System.out.println("Steward's actions: \n" +
                "1. Show menu\n" +
                "2. View orders\n" +
                "3. Create an order\n" +
                "4. Edit an order - Add a dish\n" +
                "5. Edit an order - Add a drink\n" +
                "6. Edit an order - Remove a dish\n" +
                "7. Edit an order - Remove a drink\n" +
                "8. Serve an order\n" +
                "9. Finalize an order\n" +
                "10. Add a dish to menu\n" +
                "11. Add a drink to menu\n"
              //  "12. Send an order to the kitchen"
        );

        System.out.print("Choose an action: ");
        Scanner scan = new Scanner(System.in);
        Order order = null;
        Dish dish;
        Drink drink;
        int n = scan.nextInt();
        switch (n) {
            case 1:
                showMenu(menu);
            case 2:
                this.viewOrders(orders);
            case 3:
                order = OrderFactory.createAnOrder();
                System.out.println("Current sum is: " + order.getTotalSum());
            case 4:
                dish = Dish.addADishToMenu();
                order.addDish(dish);
                System.out.println("Current sum is: " + order.getTotalSum());
            case 5:
                drink = Drink.addADrinkToMenu();
                order.addDrink(drink);
                System.out.println("Current sum is: " + order.getTotalSum());
            case 6:
                order.removeDish();
            case 7:
                order.removeDrink();
            case 8:
                serveOrder(order);
            case 9:
                finalizeOrder(order);
            case 10:
                menu.addDish(Dish.addADishToMenu());
            case 11:
                menu.addDrink(Drink.addADrinkToMenu());
           // case 12: sendToKitchen();
        }
    }

    @Override
    public String viewOrders(List<Order> orders) {
        String result = null;
        for (Order order : orders) {
            if (order.getOrderStatus() != OrderStatus.PAID) {
                result = order.toString();
            } else {
                result = "No orders.";
            }
        }
        return result;
    }

    public void showMenu(Menu menu) {
        System.out.println(menu);
    }

    public void finalizeOrder(Order order) {
        order.setOrderStatus(OrderStatus.PAID);
        this.dailyIncome += order.getTotalSum();
        System.out.println("Order on table " + order.getTable().getTableNum() + " was finalized.");
        orders.remove(order);
    }

    public void serveOrder(Order order) {
        if (order.getOrderStatus() == OrderStatus.PREPARED) {
            System.out.println("Order on table " + order.getTable().getTableNum() + " was served.");
            order.setOrderStatus(OrderStatus.SERVED);
        } else {
            System.out.println("Order on table " + order.getTable().getTableNum() + " is not prepared yet.");
        }
    }

//    public void sendToKitchen() {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter table number of the order:");
//        int tableNum = scan.nextInt();
//        for (Order currentOrder : orders) {
//            if (currentOrder.getTable().getTableNum() == tableNum) {
//                System.out.println("An order from table " + currentOrder.getTable().getTableNum() + " has been sent to the kitchen.");
//                currentOrder.setOrderStatus(OrderStatus.SERVICED);
//            } else
//                System.out.println("There is no order on the table numbered " + currentOrder.getTable().getTableNum());
//            break;
//        }
//    }

    public Steward(String name, double dailyIncome) {
        super(name);
        this.dailyIncome = dailyIncome;
    }

    @Override
    public String toString() {
        return "Steward details:" +
                "\nname->" + super.getName() +
                "\ndaily income->" + getDailyIncome();
    }
}
