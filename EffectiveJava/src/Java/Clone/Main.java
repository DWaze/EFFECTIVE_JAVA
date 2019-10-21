package Java.Clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // 1- shallow copy not effective and doesn't clone objects

        Clone clone1 = new Clone(235,"redha");
        Clone clone2 = clone1;

        clone2.name = "eezefzf";
        clone2.phone_number = 999;

        System.out.println("------ shallow copy ------");
        System.out.println(clone1); // not working because we are just referencing the same object
        System.out.println(clone2);

        // 2- deep copy bad when having a lot of variables

        clone1 = new Clone(235,"redha");
        clone2 = new Clone();

        clone2.name = clone1.name;
        clone2.phone_number = clone1.phone_number;

        clone2.name = "eeefefef";
        clone2.phone_number = 444;

        System.out.println();
        System.out.println("------ deep copy ------");
        System.out.println(clone1);
        System.out.println(clone2);

        // 3- Cloning

        clone1 = new Clone(235,"redha");
        clone2 = (Clone) clone1.clone();

        clone2.name = "ppppp";
        clone2.phone_number = 5523;

        System.out.println();
        System.out.println("------ cloning ------");
        System.out.println(clone1);
        System.out.println(clone2);

    }
}
