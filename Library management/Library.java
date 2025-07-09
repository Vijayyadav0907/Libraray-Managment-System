// Library.java

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {

    // ✅ List to store multiple books
    private List<Book> books = new ArrayList<>();

    // ✅ Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: \"" + book.getTitle() + "\" by " + book.getAuthor());
    }

    // ✅ Method to remove a book by title
    public void removeBook(String title) {
        Iterator<Book> it = books.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Book book = it.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                it.remove(); // Removes the book from the list
                System.out.println("Book removed: \"" + title + "\"");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found: \"" + title + "\"");
        }
    }

    // ✅ Method to display all books in the library
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }

        System.out.println("\n--- List of Books in the Library ---");
        for (Book book : books) {
            System.out.println(book); // Automatically calls book.toString()
        }
    }

    // ✅ Method to search for a book by its title
    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found: \"" + title + "\"");
        }
    }
}
