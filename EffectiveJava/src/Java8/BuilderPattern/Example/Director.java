package Java8.BuilderPattern.Example;

// the director is responsible for constructing the product by calling the Concrete builder

public class Director {

    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder){
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }



}
