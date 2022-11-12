public class Cook extends Еmploye implements StatusChangeable {
private int countOfPreparedDishes;

    public int getCountOfPreparedDishes() {
        return countOfPreparedDishes;
    }

    public void setCountOfPreparedDishes(int countOfPreparedDishes) {
        this.countOfPreparedDishes = countOfPreparedDishes;
    }

    public Cook(String name) {
      super.setName(name);
    }

    @Override
    public String changeOrderStatus(Order currentOrder) {

        return null;//currentOrder.setStatus("cooking" or "prepared");
    }

    @Override
    public void showPossibleActions() {
        //actions for cook
    }

    @Override
    public String toString() {
        return "Cook details:" +
                "\nname->"+super.getName()+
                "\ncount of prepared dishes->" + getCountOfPreparedDishes();
    }
}
