import java.util.List;
import java.util.Scanner;


public class Cook extends Еmployee {
    private int countOfPreparedOrders = 0;
    public int getCountOfPreparedOrders() {
        return countOfPreparedOrders;
    }

    public void setCountOfPreparedDishes(int countOfPreparedDishes) {
        this.countOfPreparedOrders = countOfPreparedDishes;
    }


    public void showPossibleActions(List <Order> orders) {

        System.out.println( "1. View new orders\n" +
                "2. Cook meals\n" +
                "3. Prepare an order");

        System.out.print( "Choose an action: ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        switch (n) {
            case 1: this.viewOrders(orders);
            case 2: this.cookMeals(chooseOrder(orders));
            case 3: this.prepareOrder(chooseOrder(orders));
        }
        scan.close();
    }
private Order chooseOrder(List <Order> orders) {
       System.out.println("Enter a number of order: ");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    while (number < 0 || number > orders.size()) {
        number = scan.nextInt();
    }
    scan.close();
    return orders.get(number - 1);
}
    private void viewOrders(List<Order> orders) {
        String result=null;
        int br=0;
        for (Order order : orders) {
            br++;
            if (order.getOrderStatus() == OrderStatus.NEW ) {
                result=result+ br+order.toString();
            } else {
                result= "No new orders.";
            }
        }
        System.out.println( result);
    }
    private void cookMeals(Order order) {
            order.setOrderStatus(OrderStatus.COOKING);
            System.out.println("The order for table number " + order.getTable().getTableNum() + " is being cooked.");
        }


    private void prepareOrder(Order order) {
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