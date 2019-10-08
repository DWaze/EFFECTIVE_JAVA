package Java8.BuilderPattern.Example;

import java.util.LinkedList;

// this class represents the product, in our case it is a vehicle

public class Product {
    private LinkedList<String> parts;

    public Product() {
        this.parts = new LinkedList<String>();
    }

    // this method is used by the concrete builder to add the different parts of the vehicle
    public void add (String part){
        parts.addLast(part);
    }

    public void show(){
        System.out.println("\n Product completed as below");

        for (int i = 0; i< parts.size(); i++){
            System.out.println(parts.get(i));
        }
    }
}
