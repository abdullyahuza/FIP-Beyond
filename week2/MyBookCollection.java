import java.util.ArrayList; //
import java.util.Iterator;
import java.util.List; //list interface for flexibility

class MyBookCollection {
    // This can be ArrayList or Linkedlist
    private List<Book> books;

    // Constructor
    public MyBookCollection() {
        books = new ArrayList<>();
    }

    // Add a book to the collection
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    // Remove a book by ISBN
    public boolean removeBookByISBN(String ISBN) {
        // create an iterator base on the book collection
        Iterator<Book> iterator = books.iterator();
        
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getISBN().equals(ISBN)) {
                iterator.remove();
                System.out.println("Removed: " + book);
                return true;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
        return false;
    }

    // List all books
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Book Collection:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}