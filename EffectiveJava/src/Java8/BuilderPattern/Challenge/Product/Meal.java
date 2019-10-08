package Java8.BuilderPattern.Challenge.Product;

import Java8.BuilderPattern.Challenge.ClassHierarchy.Item;

import java.util.ArrayList;

public class Meal {
    ArrayList<Item> items;

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
        String allItems="";
        for(Item item: items){
            allItems += item.getNameItem() + " " + item.getPriceItem()+" "+item.getPacking().pack()+"\n";
        }
        System.out.println(allItems.toString());
    }
}
