package Java.BuilderPattern.Challenge.ClassHierarchy;

public abstract class Burger implements Item {

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }

    @Override
    public abstract Float getPriceItem();
}
