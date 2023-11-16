package week7.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public record Book(String title, String author, int publicationYear, boolean isAvailable) {
}

class LibraryCatalog{
    private final List<Book> books;

    public LibraryCatalog(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Optional<Book> checkAvailabilityByTitle(String title){
        return books.stream().
                filter(book -> book.title().equalsIgnoreCase(title)).
                findFirst();
    }

    public Optional<Book> getFristAvailableBookByAuthor(String author){
        return books.stream().
                filter(book -> book.author().equalsIgnoreCase(author) && book.isAvailable())
                .findFirst();
    }

    public void updateAvailability(String title, boolean isAvailable){
        books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst()
                .ifPresent(book -> book = new Book(book.title(), book.author(), book.publicationYear(), isAvailable));
    }
}
