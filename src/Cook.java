import java.util.List;

public class Cook extends Еmploye {
    private int countOfPreparedOrders = 0;

    public Cook(String name, List<Order> orders, int countOfPreparedOrders) {
        super(name, orders);
        this.countOfPreparedOrders = countOfPreparedOrders;
    }

    public int getCountOfPreparedOrders() {
        return countOfPreparedOrders;
    }

    public void setCountOfPreparedDishes(int countOfPreparedDishes) {
        this.countOfPreparedOrders = countOfPreparedDishes;
    }


    @Override
    public void showPossibleActions() {
        //actions for cook
    }

    public List<Order> viewOrders(List<Order> orders) {
        for (Order order : orders) {
            if (order.isIsNew()) {
                order.setOrderStatus(OrderStatus.COOKING);
            }
        }
        return orders;
    }

    public Order finishOrder(Order order) {
        if (order.isIsNew() && order.getOrderStatus() == OrderStatus.COOKING) {
            order.setOrderStatus(OrderStatus.PREPEARD);
            this.countOfPreparedOrders++;
            return order;
        } else return null;
    }

    @Override
    public String toString() {
        return "Cook details:" +
                "\nname->" + super.getName() +
                "\ncount of prepared dishes->" + getCountOfPreparedOrders();
    }

}