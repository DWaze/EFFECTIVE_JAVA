package Java.BuilderPattern.Example;

// this is an interface used to describe the builder structure
// we can create different BuilderInterfaces depending on the what we want to build
// in our case we would like to build vehicles

public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();

    Product getVehicle();
}
