package Java8.BuilderPattern.Challenge.ClassHierarchy;

public abstract class Burger implements Item {

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}
