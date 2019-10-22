package Java.StringBuilder;

public class StringBuilderExample {
    // StringBuilderExample is better than normal String concatenation because StringBuilderExample is recyclable
    // StringBuilderExample can be cleaned and reused without the need of creating another StringBuilderExample
    // In the case of a normal String concatenation the java compiler will change the + operator
    // to a new String, with a new memory allocation, the problem here, imagine if we have a while
    // loop and every loop we use the + operator to concatenate Strings it will create and discard String for each
    // loop which is not efficient, in the StringBuilderExample case we will just use the same memory allocation and
    // replace.

    // String immutable (doesn't change) remove and replace with a new String
    // StringBuilder is mutable ( can be changed without creating a new object )

    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder("Hello");

        sb.append(" World");

        System.out.println(sb);
    }
}
