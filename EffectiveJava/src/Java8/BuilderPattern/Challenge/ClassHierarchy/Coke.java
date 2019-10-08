package Java8.BuilderPattern.Challenge.ClassHierarchy;

public class Coke extends ColdDrink {
    private String name;
    private Float price;

    public Coke() {
        name = "Coke";
        price = 10.0f;
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
