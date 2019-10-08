package Java8.BuilderPattern.Example;

public class Client {
    // the client create different products using the director and the builder
    public static void main(String[] args) {
        System.out.println("*****Builder Pattern Demo ***** \n");

        // director responsible for constructing any king of product
        Director director = new Director();

        // concrete builders are used to create a product and are used by the director to construct the product
        BuilderInterface carBuilder =  new Car();  // here we have a Car builder that will create car products
        BuilderInterface motorBuilder = new MotorCycler(); // here we have motorCycle builder to create products

        // making a vehicle
        director.construct(carBuilder); // we ask the director construct the car using the car builder
        Product p1 = carBuilder.getVehicle(); // getting our product from the car builder after director construction
        p1.show();

        // making a motorCycle
        director.construct(motorBuilder); // same as car
        Product p2 = motorBuilder.getVehicle();
        p2.show();
    }
}
