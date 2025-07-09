// Book.java
public class Book {

    // ✅ Private fields to store book details
    private String title;
    private String author;

    // ✅ Constructor to initialize a Book object
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // ✅ Getter method for title
    public String getTitle() {
        return title;
    }

    // ✅ Getter method for author
    public String getAuthor() {
        return author;
    }

    // ✅ toString method to print book details in a clean format
    @Override
    public String toString() {
        return "Book: \"" + title + "\" by " + author;
    }
}
