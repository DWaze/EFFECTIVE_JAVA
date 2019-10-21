package Java.BuilderPattern.Challenge.ClassHierarchy;

public class Pepsi extends ColdDrink {

    private String name;
    private Float price;

    public Pepsi() {
        name = "Pepsi";
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
