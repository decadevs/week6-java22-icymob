package org.example;

import Service.LibraryServiceImpl;
import enums.Gender;
import enums.Role;
import model.Book;
import model.Library;
import model.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        Library library = new Library();

        library.addBook(new Book("UGLY ONES ARE BORN",  "THEO",5));
        library.addBook(new Book("JAVA",  "JOHN", 2));
        library.addBook(new Book("PHYSICS",  "PETER", 9));
        library.addBook(new Book("MATHS",  "James", 3));
        library.addBook(new Book("RICH MINDS",  "JASON", 3));


        User seniorStudent = new User("Senior JASON", 12, Gender.MALE, Role.SENIOR_STUDENT);
        User teacher = new User(" Teacher JOHN ",34, Gender.MALE,Role.TEACHER);
        User juniorStudent= new User(" Junior PETER", 10, Gender.FEMALE, Role.JUNIOR_STUDENT);

        libraryService.addLibraryUserToQueue(seniorStudent);
        libraryService.addLibraryUserToQueue(juniorStudent);
        libraryService.addLibraryUserToQueue(teacher);

        System.out.println("\n");
        System.out.println("Book Given Based On Priority");
        System.out.println("-------------------------------------");
        libraryService.giveBookBasedOnPriority("JAVA", library.getBookShelf());

        System.out.println("\n");
        System.out.println("Book given based On First Come bases");
        System.out.println("-------------------------------------");
        libraryService.giveBookBasedOnFifo("MATHS", library.getBookShelf());

    }
}