public class Steward extends Еmploye implements  StatusChangeable{
private double dailyIncome;

    public double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    @Override
    public String changeOrderStatus(Order currentOrder) {
        //
        return null; //currentOrder.setStatus("served" or"paid");
    }

    @Override
    public void showPossibleActions() {
        //actions for steward
    }

    public void showMenu(MenuOfDishesAndDrinks menu){
        System.out.println( menu);
    }

    public Steward(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Steward details:" +
                "\nname->" + super.getName() +
                "\ndaily income->" + getDailyIncome();
    }
}
