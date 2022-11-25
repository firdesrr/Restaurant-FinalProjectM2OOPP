import java.util.List;
import java.util.Scanner;


public class Cook extends Еmploye {
    private int countOfPreparedOrders = 0;

    public Cook(String name, int countOfPreparedOrders) {
        super(name);
        this.countOfPreparedOrders = countOfPreparedOrders;
    }

    public int getCountOfPreparedOrders() {
        return countOfPreparedOrders;
    }

    public void setCountOfPreparedDishes(int countOfPreparedDishes) {
        this.countOfPreparedOrders = countOfPreparedDishes;
    }


    @Override
    public void showPossibleActions() {

        System.out.println( "1. Show new orders\n+" +
                "2. Cook meals\n" +
                "3. Finish order");
        List<Order> orders=OrderFactory.createListOfOrders();
        Order order=OrderFactory.createAnOrder();
        System.out.print( "Choose an action: ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        switch (n) {
            case 1: this.viewOrders(orders);
            case 2: this.cookMeals(orders);
            case 3: this.finishOrder(order);
        }
    }

    public String viewOrders(List<Order> orders) {
        String result=null;
        for (Order order : orders) {
            if (order.getOrderStatus() == OrderStatus.NEW) {
              result= order.toString();
            } else {
                result= "No new orders.";
            }
        }
        return result;
    }
    public void cookMeals(List<Order> orders) {
        for (Order order : orders) {
            order.setOrderStatus(OrderStatus.COOKING);
            System.out.println("The order for table number " + order.getTable() + " is being cooked.");
        }
    }

    public void finishOrder(Order order) {
        order.setOrderStatus(OrderStatus.PREPARED);
        System.out.println( "The order for table number " +order.getTable().getTableNum() + " has being prepared.");
            this.countOfPreparedOrders++;
    }

    @Override
    public String toString() {
        return "Cook details:" +
                "\nname->" + super.getName() +
                "\ncount of prepared dishes->" + getCountOfPreparedOrders();
    }

}