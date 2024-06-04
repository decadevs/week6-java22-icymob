package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Library<User> {
    private  List<User> libraryUsersOnQueue = new LinkedList<>();

    private List<Book> bookShelf = new ArrayList<>();


    public void addBook(Book book) {

        bookShelf.add(book);
    }

    public List<User> getLibraryUsersOnQueue() {
        return libraryUsersOnQueue;
    }

    public List<Book> getBookShelf() {
        return bookShelf;
    }
}
