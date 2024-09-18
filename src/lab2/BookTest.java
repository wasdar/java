package lab2;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Tolstoy", "Anna Karenina", 1873);
        Book book2 = new Book("Leo Tolstoy", "War and Peace", 1869);
        Book book3 = new Book("Harper Lee", "To Kill a Mockingbird", 1960);
        Book book4 = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 1997);

        BookShelf bookShelf = new BookShelf(5);

        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);
        bookShelf.addBook(book4);

        System.out.println("books on the shelf ");
        bookShelf.printBook();
        System.out.println("the latest book " + bookShelf.getLatestBook());
        System.out.println("the earliest book " + bookShelf.getEarliestBook());
        bookShelf.sortBook();
        System.out.println("sorted books ");
        bookShelf.printBook();

    }
}
