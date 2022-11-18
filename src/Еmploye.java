import java.util.ArrayList;
import java.util.List;

abstract public class Еmploye {
    private String name;
    //private List<Order> orders = new ArrayList<>();

    abstract public void showPossibleActions();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Order> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(List<Order> orders) {
//        this.orders = orders;
//    }

    public Еmploye(String name) {
        this.name = name;
        //this.orders = orders;
    }
   abstract  public List<Order> viewOrders(List<Order> orders);
}
