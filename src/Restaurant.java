import java.util.List;
import java.util.Scanner;

public class Restaurant {
    private Steward steward;
    private Cook cook;
    private Menu menu;
    private List<Order> orders;
    private List<Table> tables;

    public Steward getSteward() {
        return steward;
    }

    public void setSteward(Steward steward) {
        this.steward = steward;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public void workingRestaurant() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your position (steward or cook): ");
        String position = scan.nextLine();
        boolean employeeWorks;
        do {
            if (position.toLowerCase().equals("steward")) {
                this.steward.showPossibleActions(this.orders);
                System.out.print("Still at work? Enter true or false:  ");
                employeeWorks = scan.nextBoolean();
            } else if (position.toLowerCase().equals("cook")) {
                this.cook.showPossibleActions(this.orders);
                System.out.print("Still at work? true or false:  ");
                employeeWorks = scan.nextBoolean();
            } else {
                throw new Exception("There is no such position. Run program again.");
            }
        }
        while (employeeWorks);
        scan.close();
    }

    public Restaurant(Steward steward, Cook cook, Menu menu, List<Order> orders, List<Table> tables) {
        this.steward = steward;
        this.cook = cook;
        this.menu = menu;
        this.orders = orders;
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "steward=" + steward +
                ", cook=" + cook +
                ", menu=" + menu +
                ", orders=" + orders +
                ", tables=" + tables +
                '}';
    }
}
