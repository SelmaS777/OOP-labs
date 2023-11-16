package week7.Task2;

import week7.Task2.Book;
import week7.Task2.LibraryCatalog;

import java.util.Optional;

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        catalog.addBook(new Book("Romeo and Juliet", "William Shakespeare", 1597, true));
        catalog.addBook(new Book("Pride and Prejudice", "Jane Austin", 1813, true));
        catalog.addBook(new Book("Anna Karenina", "Leo Tolstoy", 1877, false));
        catalog.addBook(new Book("Metro 2033", "Dimitry Glukhovsky", 2005, true));

        Optional<Book> romeoAndJuliet = catalog.checkAvailabilityByTitle("Romeo and Juliet");
        romeoAndJuliet.ifPresentOrElse(
                book -> System.out.println("Romeo and Juliet found: " + book.author() + ", " + book.publicationYear()),
                () -> System.out.println("Romeo and Juliet not found")
        );

        Optional<Book> availableAnnaKarenina = catalog.getFristAvailableBookByAuthor("Leo Tolstoy");
        availableAnnaKarenina.ifPresentOrElse(
                book -> System.out.println("Available book by Leo Tolstoy: " + book.title() + ", " + book.publicationYear()),
                () -> System.out.println("No available book by Leo Tolstoy")
        );

        catalog.updateAvailability("Anna Karenina", true);
        System.out.println("Updated availability of 'Anna Karenina' to true");
    }
}
