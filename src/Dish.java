public class Dish {
    private String nameOfDish;
    private double priceOfDish;
    private String typeOfDish;//appetizer, main course, dessert

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
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

    public Dish(String nameOfDish, double priceOfDish, String typeOfDish) {
        this.nameOfDish = nameOfDish;
        this.priceOfDish = priceOfDish;
        this.typeOfDish = typeOfDish;
    }

    @Override
    public String toString() {
        return "\nDish details:" +
                "\nname->" + nameOfDish +
                "\nprice->" + priceOfDish +
                "\ntype->" + typeOfDish;
    }
}
