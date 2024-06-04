package Service;

import model.Book;
import model.User;

import java.util.List;
import java.util.Optional;

public interface LibraryService {
    String addLibraryUserToQueue(User user);

    Optional<Book> checkBook(String nameOfBook, List<Book> books);

    String giveBookBasedOnFifo(String book, List<Book> books);

    String giveBookBasedOnPriority(String book, List<Book> books);

}
