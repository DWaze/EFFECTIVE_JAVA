package Java8.BuilderPattern.Challenge.ClassHierarchy;

public abstract class ColdDrink implements Item {

    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
