package NestedClasses;

class Library {
    String libraryName;

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    class Book {

        public void getLibraryName() {
            System.out.println("Library name: " + libraryName);
        }
    }
}

public class InnerClassAccess {
    public static void main(String[] args) {
        Library library = new Library("Central Library");
        Library.Book book = library.new Book();
        book.getLibraryName();
    }
}
