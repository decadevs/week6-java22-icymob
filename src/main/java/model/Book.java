package model;

public class Book {
    private String name;
    private String author;
    private int noOfCopies;

    public Book(String name, String author, int noOfCopies) {
        this.name = name;
        this.author = author;
        this.noOfCopies = noOfCopies;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }
}
