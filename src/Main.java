import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Steward steward=new Steward("Petrov",0.0);
        steward.showPossibleActions();

        System.out.println("************************************************");
        System.out.println("***Restaurant service information system***");
        System.out.println("************************************************");
        System.out.println();
        System.out.println("Enter your position (steward or cook): ");
        String position = scan.nextLine();


//        Menu menu = new MenuOfDishesAndDrinks(dishes, drinks);
//        System.out.println( menu);
    }
}