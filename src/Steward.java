import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Steward extends Еmploye {
private double dailyIncome;
private Menu menu=MenuFactory.createMenu();
private List <Order> orders;




    public double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }



    @Override
    public void showPossibleActions() {
        //actions for steward

        System.out.println( "Steward's actions: \n" +
                "1. Show menu\n" +
                "2. View orders\n" +
                "3. Create an order\n" +
                "4. Edit an order - Add a dish/drink\n" +
                "5. Edit an order - Remove a dish/drink\n");
        System.out.print( "Choose an action: ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        switch (n) {
            case 1: this.menu.toString();
            case 2: this.viewOrders(orders);
            case 3: OrderFactory.createAnOrder();
        }
    }

    @Override
    public String viewOrders(List<Order> orders) {
        String result=null;
        for (Order order : orders) {
            if (order.getOrderStatus() == OrderStatus.NEW ||order.getOrderStatus() == OrderStatus.COOKING || order.getOrderStatus() == OrderStatus.PREPARED || order.getOrderStatus() == OrderStatus.SERVED) {
               result= order.toString();
            } else {
                result= "No orders.";
            }
        }
        return result;
    }

//    public void showMenu(Menu menu){
//        System.out.println( menu);
//    }

    public Steward(String name, double dailyIncome) {
        super(name);
        this.dailyIncome = dailyIncome;
    }

    //creating an order
public Order createAnOrder(){
        Order order=null;
    createAnOrder();
    this.dailyIncome+= order.getTotalSum();
    return order;
}

    @Override
    public String toString() {
        return "Steward details:" +
                "\nname->" + super.getName() +
                "\ndaily income->" + getDailyIncome();
    }
}
