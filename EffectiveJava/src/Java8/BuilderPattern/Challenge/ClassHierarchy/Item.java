package Java8.BuilderPattern.Challenge.ClassHierarchy;

public interface Item {

    public void setNameItem(String name);
    public void setPriceItem(Float price);
    public String getNameItem();
    public Float getPriceItem();
    public Packing getPacking();
}
