package Java8.BuilderPattern.Challenge.ClassHierarchy;

public class ChickenBurger extends Burger {
    private String name;
    private float price;

    public ChickenBurger() {
        name = "Chicken Burger";
        price = 35.0f;
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
