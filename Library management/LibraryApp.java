// LibraryApp.java

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // To take user input
        Library library = new Library();            // Create a Library object

        System.out.println("📚 Welcome to the Library Management System 📚");

        // Menu loop
        while (true) {
            System.out.println("\n--- Library Menu ---"); 
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View Books");
            System.out.println("4. Search Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            // Take the user choice
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the leftover newline character

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();

                    Book book = new Book(title, author); // Create a new Book object
                    library.addBook(book);               // Add the book to the library
                    break;

                case 2:
                    // Remove Book
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    library.removeBook(removeTitle);
                    break;

                case 3:
                    // View all books
                    library.viewBooks();
                    break;

                case 4:
                    // Search for a book
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    scanner.close();
                    return;  // Exit from main method

                default:
                    System.out.println("❌ Invalid choice. Please select between 1 to 5.");
            }
        }
    }
}
