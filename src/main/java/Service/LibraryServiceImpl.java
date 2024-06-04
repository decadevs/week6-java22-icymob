package Service;

import model.Book;
import model.Library;
import model.User;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LibraryServiceImpl implements LibraryService {
    Library library = new Library();

    private String giveBook(String book, List<Book> books) {
        library.getLibraryUsersOnQueue().forEach(user -> {
            checkBook(book, books).ifPresent(book1 -> {
                System.out.println(book1.getName() + " is with " + user.getClass());
            });
        });
        return book;
    }

    @Override

    public String addLibraryUserToQueue(User user) {
        library.getLibraryUsersOnQueue().add(user);
        return user.getName();
    }

    @Override
    public Optional<Book> checkBook(String nameOfBook, List<Book> books) {
        Optional<Book> optionalBook = books.stream()
                .filter(b -> nameOfBook.equals(b.getName()) && b.getNoOfCopies() > 0)
                .findFirst();
        optionalBook.ifPresent(book -> book.setNoOfCopies(book.getNoOfCopies() - 1));
        return optionalBook;
    }


    @Override
    public String giveBookBasedOnFifo(String book, List<Book> books) {
        return giveBook(book, books);
    }

    @Override
    public String giveBookBasedOnPriority(String book, List<Book> books) {
        Collections.sort(library.getLibraryUsersOnQueue(), Comparator.comparing(User::getRole));
        return giveBook(book, books);
    }
}