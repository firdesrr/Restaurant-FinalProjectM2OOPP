import java.util.ArrayList;
import java.util.List;

public class MenuOfDishesAndDrinks {
  private  List<Dish> dishes=new ArrayList<>();
  private  List<Drink> drinks=new ArrayList<>();

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
    public MenuOfDishesAndDrinks(List<Dish> dishes, List<Drink> drinks) {
        this.dishes = dishes;
        this.drinks = drinks;
    }
    @Override
    public String toString() {
        return "Menu:" +
                '\n'+dishes +
        '\n'+ drinks;
    }
}
