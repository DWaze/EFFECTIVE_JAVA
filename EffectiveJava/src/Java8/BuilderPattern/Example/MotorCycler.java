package Java8.BuilderPattern.Example;

// this class is a concrete builder it implements the builder interface and is responsible for
// building the parts of our product

public class MotorCycler implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a MotorCycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 Wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlights are added.");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
