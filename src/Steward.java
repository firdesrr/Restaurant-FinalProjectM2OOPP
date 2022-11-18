import java.util.ArrayList;
import java.util.List;

public class Steward extends Еmploye {
private double dailyIncome;


    public double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }



    @Override
    public void showPossibleActions() {
        //actions for steward
    }

    @Override
    public List<Order> viewOrders(List<Order> orders) {
               return orders;
    }

    public void showMenu(MenuOfDishesAndDrinks menu){
        System.out.println( menu);
    }

    public Steward(String name, List<Order> orders, double dailyIncome) {
        super(name, orders);
        this.dailyIncome = dailyIncome;
    }

    @Override
    public String toString() {
        return "Steward details:" +
                "\nname->" + super.getName() +
                "\ndaily income->" + getDailyIncome();
    }
}
