package Java.SingeltonClasse;

// a singleton class is s class that can have only one object at a class

// to make a class singleton we have to make two steps :
//  1- Make constructor private so he can so we can not use it to create objects.
//  2- Writing a static method that has return type object of the singleton class
//  3- Making a static instance of the singleton classes and use it in the getInstance method.

public class SingletonClass {
    public static void main(String[] args) {

//        in this example we are demonstrating how singletonClasses work

//        here we are creating three instances of the singleton class
        Singleton x = Singleton.getInstance();

        Singleton y = Singleton.getInstance();

        Singleton z = Singleton.getInstance();

//        Changing the object x string to upperCase
        x.s = (x.s).toUpperCase();

//        we can see that the modification applied in the x instance has also been applied in the other instance
//        The getInstance method create only one object for three instance
        System.out.println("String from x is "+ x.s);
        System.out.println("String  from y is "+ y.s);
        System.out.println("String  from z is "+ z.s);
        System.out.println("\n");

        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from Z is " + z.s);
    }
}
