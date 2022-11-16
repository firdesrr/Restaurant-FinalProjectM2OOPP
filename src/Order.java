import java.util.ArrayList;
import java.util.List;

public class Order implements Orderable {
    private String date;//dd-mm-yyy
    private String timeOfCreation;//hh:mm:ss
    private int tableNumber;
    private OrderStatus orderStatus;
    private List<Dish> dishes = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    double totalSum = 0.0;

    @Override
    public void addDish(Dish dish) {
        dishes.add(dish);
        totalSum += dish.getPriceOfDish();
    }

    @Override
    public void addDrink(Drink drink) {
        drinks.add(drink);
        totalSum += drink.getPriceOfDrink();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(String timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    public Order(String date, String timeOfCreation, int tableNumber, OrderStatus orderStatus, List<Dish> dishes, List<Drink> drinks, double totalSum) {
        this.date = date;
        this.timeOfCreation = timeOfCreation;
        this.tableNumber = tableNumber;
        this.orderStatus = orderStatus;
        this.dishes = dishes;
        this.drinks = drinks;
        this.totalSum = totalSum;
    }

    @Override
    public String toString() {
        return "Order:" +
                "\ndate->'" + getDate() +
                "\ntime of creation->'" + getTimeOfCreation() +
                "\ntable number->" + getTableNumber() +
                "\norder status->'" + getOrderStatus() +
                "\ndishes->" + getDishes() +
                "\ndrinks->" + getDrinks() +
                "\ntotal sum->" + getTotalSum();
    }
}
