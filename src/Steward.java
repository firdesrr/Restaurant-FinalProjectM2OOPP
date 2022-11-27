import java.util.List;
import java.util.Scanner;

public class Steward extends Еmployee {
    private double dailyIncome;
    private Menu <Dish,Drink>menu ;
    private List <Order>orders;
    private Order order;


    public double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }


    public void showPossibleActions(List<Order> orders) {
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
        int n = scan.nextInt();
        switch (n) {
            case 1:
                showMenu(menu);
                break;
            case 2:
                this.viewOrders(orders);
                break;
            case 3:
                order=OrderFactory.createAnOrder();
                orders.add(order );
                System.out.println("Current sum is: " + order.getTotalSum());
                break;
            case 4:
                System.out.println( "Enter  number of dish: ");
                int numOfDish = scan.nextInt();
                Dish dish = order.addDish(menu.getDishes().get(numOfDish-1));
                if (dish != null) {
                    order.addDish(dish);
                }
                System.out.println("Current sum is: " + order.getTotalSum());
                break;
            case 5:
                System.out.println( "Enter  number of dish: ");
                int numOfDrink = scan.nextInt();
                Drink drink = order.addDrink(menu.getDrinks().get(numOfDrink-1));
                if (drink != null) {
                    order.addDrink(drink);
                }
                System.out.println("Current sum is: " + order.getTotalSum());
                break;
            case 6:
                order.removeDish();
                break;
            case 7:
                order.removeDrink();
                break;
            case 8:
                serveOrder(orders);
                break;
            case 9:
                finalizeOrder(orders);
                break;
            case 10:
                menu.addDish(Dish.createDish());
                break;
            case 11:
                menu.addDrink(Drink.addADrinkToMenu());
                break;
            // case 12: sendToKitchen();
        }
        scan.close();
    }


    private void viewOrders(List<Order> orders) {
        String result = null;
        for (Order order : orders) {
            if (order.getOrderStatus() != OrderStatus.PAID) {
                result = order.toString();
            } else {
                result = "The order has been paid";
            }
        }
        System.out.println( result);
    }

    public void showMenu(Menu <Dish,Drink>menu) {
        System.out.println( menu);
    }

    public void finalizeOrder(List<Order> orders) {
        System.out.println("Enter a number of order: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while (number < 0 || number > orders.size()) {
            number = scan.nextInt();
        }
        orders.get(number - 1).setOrderStatus(OrderStatus.PAID);
        this.dailyIncome += orders.get(number - 1).getTotalSum();
        System.out.println("Order on table " + orders.get(number - 1).getTable().getTableNum() + " was finalized.");
        orders.remove(orders.get(number - 1));
        scan.close();
    }

    public void serveOrder(List <Order> orders) {
        for (Order order : orders) {
            if (order.getOrderStatus() == OrderStatus.PREPARED) {
                System.out.println("Order on table " + order.getTable().getTableNum() + " was served.");
                order.setOrderStatus(OrderStatus.SERVED);
            } else {
                System.out.println("Order on table " + order.getTable().getTableNum() + " is not prepared yet.");
            }
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
