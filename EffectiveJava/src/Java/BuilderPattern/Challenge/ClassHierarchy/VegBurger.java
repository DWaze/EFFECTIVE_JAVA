package Java.BuilderPattern.Challenge.ClassHierarchy;

public class VegBurger extends Burger {
    private String name;
    private float price;

    public VegBurger() {
        name = "Veg Burger";
        price = 30.0f;
    }

    @Override
    public void setNameItem(String name) {
        this.name = name;
    }

    @Override
    public void setPriceItem(Float price) {
        this.price = price;
    }

    @Override
    public String getNameItem() {
        return name;
    }

    @Override
    public Float getPriceItem() {
        return price;
    }
}
