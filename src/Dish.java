public class Dish {
    private String name;
    private double priceOfDish;
    private String typeOfDish;//appetizer, main course, dessert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceOfDish() {
        return priceOfDish;
    }

    public void setPriceOfDish(double priceOfDish) {
        this.priceOfDish = priceOfDish;
    }

    public String getTypeOfDish() {
        return typeOfDish;
    }

    public void setTypeOfDish(String typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public Dish(String name, double priceOfDish, String typeOfDish) {
        this.name = name;
        this.priceOfDish = priceOfDish;
        this.typeOfDish = typeOfDish;
    }

    @Override
    public String toString() {
        return "\nDish details:" +
                "\nname->" + name +
                "\nprice->" + priceOfDish +
                "\ntype->" + typeOfDish+'\n';
    }
}
