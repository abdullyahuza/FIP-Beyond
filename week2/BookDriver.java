public class BookDriver {
    public static void main(String[] args) {

        // instantiate book collection
        MyBookCollection collection = new MyBookCollection();

        // book instances
        Book book1 = new Book("Data Structures and Algorithms in Java", "Robert Lafore", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        // add books to the the book collection
        collection.addBook(book1);
        collection.addBook(book2);

        // list books in a collection
        collection.listBooks();

        // remove book from a collection
        collection.removeBookByISBN("1234567890");
        
        // list books in a collection
        collection.listBooks();
    }
}