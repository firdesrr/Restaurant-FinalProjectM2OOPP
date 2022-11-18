import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Steward extends Еmploye {
private double dailyIncome;
private List <Dish> dishes=new ArrayList<>();
private List <Drink> drinks=new ArrayList<>();
private Menu menu=new Menu(dishes,drinks);
private List <Order> orders=new ArrayList<>();
private Order order;



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
                "4. Edit an order - add a dish/drink\n" +
                "5. Edit an order - remove a dish/drink\n");
        System.out.print( "Choose an action: ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        switch (n) {
            case 1: this.showMenu(menu);
            case 2: this.viewOrders(orders);
            case 3: this.createAnOrder(order);
        }
    }

    @Override
    public List<Order> viewOrders(List<Order> orders) {
               return orders;
    }

    public void showMenu(Menu menu){
        System.out.println( menu);
    }

    public Steward(String name, double dailyIncome) {
        super(name);
        this.dailyIncome = dailyIncome;
    }

    //creating an order
public Order createAnOrder(Order order){
    OrderFactory.createAnOrder(order);
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
