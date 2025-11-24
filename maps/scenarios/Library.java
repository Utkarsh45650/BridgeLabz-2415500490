package maps.scenarios;
import java.util.*;

public class Library {
    public static void main(String[] args) {
        Map<String, String> books = new TreeMap<>();

        books.put("978-1234567890", "Java Basics");
        books.put("978-4567890123", "Python Intro");
        books.put("978-7890123456", "C++ Guide");

        String isbn = "978-4567890123";
        System.out.println(books.getOrDefault(isbn, "Book not found"));

        books.remove("978-7890123456");

        for (var e : books.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // search by title
        String titleSearch = "Java Basics";
        for (var e : books.entrySet()) {
            if (e.getValue().equalsIgnoreCase(titleSearch)) {
                System.out.println("Found ISBN = " + e.getKey());
            }
        }
    }
}
