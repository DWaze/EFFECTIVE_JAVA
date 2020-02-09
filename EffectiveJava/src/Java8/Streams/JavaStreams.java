package Java8.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) throws IOException {
        // 1. Integer Stream
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(System.out::println);
        System.out.println();

        // 2. Sum Integers
        System.out.println(
        IntStream
                .range(1,5)
                .sum());
        System.out.println();

        // 3. Hadling Strings
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // 4. Stream from array, sort, filter and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        // 5. average of squares of an int array
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        // 6. Stream from list, filter and print
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

        // 7. Stream rows from text file, sort, filter, and print
        Stream<String> bands = Files.lines(Paths.get("/home/dredhat/IdeaProjects/EFFECTIVE_JAVA/EffectiveJava/src/" +
                "Java8/Streams/bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();

        //8. Stream row from text file and save to list
        List<String> bands2 = Files.lines(Paths.get("/home/dredhat/IdeaProjects/EFFECTIVE_JAVA/EffectiveJava/src/" +
                "Java8/Streams/bands.txt"))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList());

        bands2.forEach(System.out::println);

        //9. Stream rows from CSV file and count
        Stream<String> rows1 = Files.lines(Paths.get("/home/dredhat/IdeaProjects/EFFECTIVE_JAVA/EffectiveJava/src/" +
                "Java8/Streams/data.csv"));
        int rowCount = (int)rows1
                .map(x -> x.split(","))
                .filter(x -> x.length ==3)
                .count();

        System.out.println(rowCount +" rows.");
        rows1.close();

        //10. Stream rows from CSV file, parse data from rows
        Stream<String> rows2 = Files.lines(Paths.get("/home/dredhat/IdeaProjects/EFFECTIVE_JAVA/EffectiveJava/src/" +
                "Java8/Streams/data.csv"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length ==3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));

        rows2.close();

        // 11. Stream rows from CSV file, parse data from rows

        Stream<String> rows7 = Files.lines(Paths.get("/home/dredhat/IdeaProjects/EFFECTIVE_JAVA/EffectiveJava/src/" +
                "Java8/Streams/data.csv"));
        rows7
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1])> 15)
                .forEach(x -> System.out.println(x[0] + "   " + x[1] + "    " + x[2]));
        rows7.close();

        // 12. Stream rows from CSV file, store fields in HashMap
        Stream<String> rows3 = Files.lines(Paths.get("/home/dredhat/IdeaProjects/EFFECTIVE_JAVA/EffectiveJava/src/" +
                "Java8/Streams/data.csv"));

        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));

        rows3.close();

        for (String key: map.keySet()){
            System.out.println(key + "  " + map.get(key));
        }

        // 13. Reduction - sum
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a+b);
        System.out.println("Total = " + total);

        // 14. Reduction Summary Statistics
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73 ,4 ,10)
                .summaryStatistics();
        System.out.println(summary);

        // 15. Flat Map example
        Student obj1 = new Student();
        obj1.setName("mkyong");
        obj1.addBook("Java 8 in Action");
        obj1.addBook("Spring Boot in Action");
        obj1.addBook("Effective Java (2nd Edition)");

        Student obj2 = new Student();
        obj2.setName("zilap");
        obj2.addBook("Learning Python, 5th Edition");
        obj2.addBook("Effective Java (2nd Edition)");

        List<Student> studentList = new ArrayList<>();
        studentList.add(obj1);
        studentList.add(obj2);

        List<String> collect =
                studentList.stream()
                        .map(x -> x.getBook()) // in this step we are gathering the list of books of each student
                        .flatMap(x -> x.stream()) // Transform list to string elements to be transmitted to the distinct
                        .distinct() // remove duplicates and take only unique elements
                        .collect(Collectors.toList()); // gathering the result into a collection

        collect.forEach(System.out::println); // using for each to print the different elements

        // 16. mapToDouble example
        List<String> list = Arrays.asList("CSE", "JAVA", "gfg",
                "C++", "C");

        list.stream().mapToDouble(str -> str.length() * str.length())  // transform the resulting multiplication to
                // double
                .forEach(System.out::println);

        // 18. peek example

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }
}
