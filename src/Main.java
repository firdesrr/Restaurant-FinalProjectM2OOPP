import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Cook cook=new Cook( "Manchev", 0);
        Steward steward=new Steward("Petrov",0.0);
        Menu menu=MenuFactory.createMenu();
        Order order;
        List <Order> orders = null;
        Restaurant restaurant=new Restaurant(steward, cook,menu,orders);


        System.out.println("************************************************");
        System.out.println("***Restaurant service information system***");
        System.out.println("************************************************");
        System.out.println();


restaurant.workingRestaurant();


//        Menu menu = new MenuOfDishesAndDrinks(dishes, drinks);
//        System.out.println( menu);
    }
}