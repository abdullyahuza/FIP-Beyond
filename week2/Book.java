
class Book {
    
    // attributes
    private String title;
    private String author;
    private String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters
    public String getTitle() {
        return title; 
    }
    
    public String getAuthor() { 
        return author; 
    }

    public String getISBN() {
        return ISBN; 
    }

    // To String method for displaying book info
    @Override
    public String toString() {
        return "Book{" + 
               "Title='" + title + '\'' + 
               ", Author='" + author + '\'' + 
               ", ISBN='" + ISBN + '\'' + 
               '}';
    }
}
