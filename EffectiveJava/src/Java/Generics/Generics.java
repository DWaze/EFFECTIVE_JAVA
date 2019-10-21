package Java.Generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Generics {
    public static void main(String[] args) {

        // Generic
        // without generics
        List list  = new LinkedList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new String("Hello there"));

        Integer a = (Integer)list.iterator().next(); // without generic types we need to make a casting every time
        // the casting is required because the compiler has no warranty that the type of element is integer.
        // that means that we can put multiple type of objects in one list which can lead to bugs

        // with generics

        List<Integer> list2  = new LinkedList<Integer>(); // generics allow us to unify the type of object in a list
        list2.add(new Integer(4));
        list2.add(new Integer(8));
//        list2.add(new String("Hello There")); // this line of code will fire an error because it is a string and our
//        list accepts only integers.

        Integer b = list2.iterator().next();  //

    }

//    Generic methods
//    a generic method is a method that accepts generic list or variables with the same generic type specified in the
//    method
    public <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

//    in the case if this method we can see that the interpreter doesn't accept G because it is not declared as a
//    generic type of a method
//    public <T> List<T> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
//        return Arrays.stream(a).collect(Collectors.toList());
//    }
}
