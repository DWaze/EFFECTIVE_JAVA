package Java8.Clone;

public class Main {
    public static void main(String[] args) {
        Clone clone1 = new Clone(235,"redha");
//        Clone clone2 = new Clone(235,"redha");
        Clone clone2 = null;
        try {
            clone2 = (Clone) clone1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        if(clone1.equals(clone2)){
            System.out.println("the two objects are equal");
        }else{
            System.out.println("the two objects are not equal! ");
        }
    }
}
