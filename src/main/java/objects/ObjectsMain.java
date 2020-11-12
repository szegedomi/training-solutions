package objects;

import java.util.ArrayList;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        System.out.println(new Book());

        Book emptyBook = new Book();

        emptyBook = null;
        System.out.println(emptyBook);

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        Book[] books = new Book[3];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;

        List<Book> books2 = new ArrayList<>();

        books2.add(book1);
        books2.add(book2);
        books2.add(book3);

        System.out.println(books.length);
        System.out.println(books2.size());



    }

}
