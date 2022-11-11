public class Drink {
    private String nameOfDrink;
    private double priceOfDrink;
    private String typeOfDrink;//alcoholic, non-alcoholic, hot drink

    public String getNameOfDrink() {
        return nameOfDrink;
    }

    public void setNameOfDrink(String nameOfDrink) {
        this.nameOfDrink = nameOfDrink;
    }

    public double getPriceOfDrink() {
        return priceOfDrink;
    }

    public void setPriceOfDrink(double priceOfDrink) {
        this.priceOfDrink = priceOfDrink;
    }

    public String getTypeOfDrink() {
        return typeOfDrink;
    }

    public void setTypeOfDrink(String typeOfDrink) {
        this.typeOfDrink = typeOfDrink;
    }

    public Drink(String nameOfDrink, double priceOfDrink, String typeOfDrink) {
        this.nameOfDrink = nameOfDrink;
        this.priceOfDrink = priceOfDrink;
        this.typeOfDrink = typeOfDrink;
    }

    @Override
    public String toString() {
        return "\nDrink details:" +
               "\nname->" + nameOfDrink +
                "\nprice->" + priceOfDrink +
                "\ntype->"+ typeOfDrink;
    }
}
