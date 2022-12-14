import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order implements Orderable {
    private LocalDate date;//dd-mm-yyy
    private LocalTime timeOfCreation;//hh:mm:ss
    private Table table;
    private OrderStatus orderStatus = OrderStatus.NEW;
    private List<Dish> dishes = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private double totalSum = 0.0;


    @Override
    public Dish addDish(Dish dish) {
        dishes.add(dish);
        System.out.println("A dish named " + dish.getName() + " has been added.");
        totalSum += dish.getPrice();
        return dish;
    }

    @Override
    public Drink addDrink(Drink drink) {
        drinks.add(drink);
        System.out.println("A drink named " + drink.getName() + " has been added.");
        totalSum += drink.getPrice();
        return drink;
    }

    public void removeDish() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter dish name to remove:");
        String nameDishToRemove = scan.nextLine();
        for (Dish currentDish : dishes) {
            if (currentDish.getName().toLowerCase().equals(nameDishToRemove.toLowerCase())) {
                totalSum -= currentDish.getPrice();
                dishes.remove(currentDish);
                System.out.println("A dish named " + nameDishToRemove + " has been added.");
            } else System.out.println("A dish named " + nameDishToRemove + " is not in order.");
            break;
        }
        scan.close();
    }

    public void removeDrink() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter drink name to remove:");
        String nameDrinkToRemove = scan.nextLine();
        for (Drink currentDrink : drinks) {
            if (currentDrink.getName().toLowerCase().equals(nameDrinkToRemove.toLowerCase())) {
                totalSum -= currentDrink.getPrice();
                drinks.remove(currentDrink);
                System.out.println("A dish named " + nameDrinkToRemove + " has been added.");
            } else System.out.println("A dish named " + nameDrinkToRemove + " is not in order.");
            break;
        }
        scan.close();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(LocalTime timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
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


    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }


    public Order(String s, String s1, int i, boolean b, OrderStatus aNew, List<Dish> dishes, List<Drink> drinks, double v) {
    }

    public Order(Table table, OrderStatus orderStatus, List<Dish> dishes, List<Drink> drinks, double totalSum) {
        this.date = LocalDate.now();
        this.timeOfCreation = LocalTime.now();
        this.table = table;
        this.orderStatus = orderStatus;
        this.dishes = dishes;
        this.drinks = drinks;
        this.totalSum = totalSum;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "date='" + date + '\'' +
                ", timeOfCreation='" + timeOfCreation + '\'' +
                ", table=" + table +
                ", orderStatus=" + orderStatus +
                ", dishes=" + dishes +
                ", drinks=" + drinks +
                ", totalSum=" + totalSum +
                '}';
    }
}
