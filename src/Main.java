import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Cook cook=new Cook( "Manchev", 0);
        Steward steward=new Steward("Petrov",0.0);
        Menu  <Dish, Drink> menu=MenuFactory.createMenu();
        List <Table> tables=new ArrayList<>();
        for (int i=0;i<5;i++){
                tables.add(new Table(i+1,true));
        }
        Order order;
        List <Order> orders = null;
        Restaurant restaurant=new Restaurant(steward, cook,menu,orders,tables);


        System.out.println("************************************************");
        System.out.println("***Restaurant service information system***");
        System.out.println("************************************************");
        System.out.println();


restaurant.workingRestaurant();
    }
}