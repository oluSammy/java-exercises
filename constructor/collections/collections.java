package constructor.collections;
import java.util.HashMap;

class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class collections {
    public static void main(String args[]) {
        HashMap<String, Book> bookDetails = new HashMap<>();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 20);

        bookDetails.put(book1.author, book1);
        bookDetails.put(book2.author, book2);

        System.out.println(bookDetails.get(book1.author).title);
        System.out.println(bookDetails.get(book2.author).title);
    }
}