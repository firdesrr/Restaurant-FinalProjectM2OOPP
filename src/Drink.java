public class Drink {
    private String nameOfDrink;
    private double priceOfDrink;
    private TypeOfDrink typeOfDrink;

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

    public TypeOfDrink getTypeOfDrink() {
        return typeOfDrink;
    }

    public void setTypeOfDrink(TypeOfDrink typeOfDrink) {
        this.typeOfDrink = typeOfDrink;
    }

    public Drink(String nameOfDrink, double priceOfDrink, TypeOfDrink typeOfDrink) {
        this.nameOfDrink = nameOfDrink;
        this.priceOfDrink = priceOfDrink;
        this.typeOfDrink = typeOfDrink;
    }

    @Override
    public String toString() {
        return "\nDrink details:" +
               "\nname->" + nameOfDrink +
                "\nprice->" + priceOfDrink +
                "\ntype->"+ typeOfDrink+'\n';
    }
}
