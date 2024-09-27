package constructor.constructorOverloading;

class Book {
    String title;
    String author;
    int price;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);
    }
}

public class constructorOverloading {
    public static void main(String args[]) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 100);

        book1.display();
        book2.display();
    }
}
