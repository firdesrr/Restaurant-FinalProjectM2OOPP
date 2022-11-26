import java.util.List;

abstract public class Еmployee {
    private String name;
      abstract public void showPossibleActions();
    abstract  public String viewOrders(List<Order> orders);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Еmployee(String name) {
        this.name = name;

    }

}
