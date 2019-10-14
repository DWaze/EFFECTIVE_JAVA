package Java8.BuilderPattern.Challenge.Product;

import Java8.BuilderPattern.Challenge.ClassHierarchy.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;

    public Meal() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public Float getCost(){
        Float totalPrice= 0.0f;
        for(Item item:items){
            totalPrice+=item.getPriceItem();
        }
        return totalPrice;
    }

    public void showItems(){
        for(Item item: items){
            System.out.println("item : "+ item.getNameItem());
            System.out.println(", Packing : "+ item.getPacking().pack());
            System.out.println(", Price : "+ item.getPriceItem());
            System.out.println();
        }
    }
}
