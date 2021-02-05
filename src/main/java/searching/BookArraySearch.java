package searching;

import java.util.Arrays;
import java.util.Collections;

public class BookArraySearch {

    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] getBookArray() {
        return bookArray;
    }

    public Book findBookByAuthorTitle(String author, String title){
        Arrays.sort(bookArray);
        int index = Arrays.binarySearch(bookArray, new Book(1010, author, title));
        if(index < 0){
            throw new IllegalArgumentException(String.format("No book found by %s with title %s", author, title));
        }
        return bookArray[index];
    }
}
