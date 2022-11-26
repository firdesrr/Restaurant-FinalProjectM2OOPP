import java.util.ArrayList;
import java.util.List;

public class Menu<Dish, Drink> {
    private List<Dish> dishes;
    private List<Drink> drinks;

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

    public Menu() {

    }

    public List<Drink> addDrink(Drink drink) {
        if (!(this.drinks.contains(drink))) {
            drinks.add(drink);
            System.out.println("The drink has been added to the menu.");
        } else {
            System.out.println("The menu already contains the drink.");
        }
        return this.drinks;
    }

    public List<Dish> addDish(Dish dish) {
        if (!this.dishes.contains(dish)) {
            dishes.add(dish);
            System.out.println("The dish has been added to the menu.");
        } else {
            System.out.println("The menu already contains the dish.");
        }
        return this.dishes;
    }

    public Menu(List<Dish> dishes, List<Drink> drinks) {
        this.dishes = dishes;
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Menu:" +
                '\n' + getDishes() + '\n' +
                '\n' + getDrinks();
    }
}
