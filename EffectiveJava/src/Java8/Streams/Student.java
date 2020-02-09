package Java8.Streams;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private Set<String> book;

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public Set<String> getBook() {
        return book;
    }
}
