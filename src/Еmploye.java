import java.util.ArrayList;
import java.util.List;

abstract public class Еmploye {
    private String name;
      abstract public void showPossibleActions();
    abstract  public String viewOrders(List<Order> orders);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Еmploye(String name) {
        this.name = name;

    }

}
