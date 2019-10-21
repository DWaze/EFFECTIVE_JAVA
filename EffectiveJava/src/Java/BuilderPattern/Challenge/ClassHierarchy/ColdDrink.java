package Java.BuilderPattern.Challenge.ClassHierarchy;

public abstract class ColdDrink implements Item {

    @Override
    public Packing getPacking() {
        return new Bottle();
    }

    @Override
    public abstract Float getPriceItem();
}
