import java.util.ArrayList;
import java.util.List;

public class Menu {
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

    public Menu() {

    }
    public Menu(List<Dish> dishes, List<Drink> drinks) {
        this.dishes = dishes;
        this.drinks = drinks;
    }



    @Override
    public String toString() {
        return "Menu:" +
                '\n'+getDishes() +'\n'+
        '\n'+ getDrinks();
    }
}
