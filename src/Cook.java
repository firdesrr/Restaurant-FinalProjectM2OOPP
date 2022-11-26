import java.util.List;
import java.util.Scanner;


public class Cook extends Еmployee {
    private int countOfPreparedOrders = 0;
    List<Order> orders;
       public int getCountOfPreparedOrders() {
        return countOfPreparedOrders;
    }

    public void setCountOfPreparedDishes(int countOfPreparedDishes) {
        this.countOfPreparedOrders = countOfPreparedDishes;
    }


    @Override
    public void showPossibleActions() {
        System.out.println( "1. View new orders\n+" +
                "2. Cook meals\n" +
                "3. Prepare an order");
        Order order=OrderFactory.createAnOrder();
        System.out.print( "Choose an action: ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        switch (n) {
            case 1: this.viewOrders(orders);
            case 2: this.cookMeals(orders);
            case 3: this.prepareOrder(order);
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

    public void prepareOrder(Order order) {
        order.setOrderStatus(OrderStatus.PREPARED);
        System.out.println( "The order for table number " +order.getTable().getTableNum() + " has been prepared.");
            this.countOfPreparedOrders++;
    }
    public Cook(String name, int countOfPreparedOrders) {
        super(name);
        this.countOfPreparedOrders = countOfPreparedOrders;
    }
    @Override
    public String toString() {
        return "Cook details:" +
                "\nname->" + super.getName() +
                "\ncount of prepared dishes->" + getCountOfPreparedOrders();
    }

}