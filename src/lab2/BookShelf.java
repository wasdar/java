package lab2;

import java.util.Arrays;

public class BookShelf {
    private Book[] books;
    private int numofbooks;

    public BookShelf(int size) {
        this.books = new Book[size];
        this.numofbooks = 0;
    }

    public void addBook(Book book) {
        if (numofbooks < books.length) {
            books[numofbooks] = book;
            numofbooks++;
        } else {
            System.out.println("the shelf is full, cant add a book");
        }
    }
    public Book getLatestBook(){
        if (numofbooks == 0) return null;
        Book latestBook = books[0];
        for (int i = 1; i < numofbooks; i++){
            if (books[i].getYear() > latestBook.getYear()){
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public Book getEarliestBook() {
        if (numofbooks == 0) return null;

        Book earliestBook = books[0];
        for (int i = 1; i < numofbooks; i++) {
            if (books[i].getYear() < earliestBook.getYear()) {
                earliestBook = books[i];
            }
        }
        return earliestBook;
    }

    public void sortBook() {
        Arrays.sort(books, 0, numofbooks, (b1, b2) -> Integer.compare(b1.getYear(), b2.getYear()));
    }

    public void printBook(){
        for (int i = 0; i < numofbooks; i++) {
            System.out.println(books[i]);
        }
    }

}
