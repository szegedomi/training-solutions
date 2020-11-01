package classsctructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("J.R.R. Tolkien", "The Lord of The Rings");
        book.register("ABC123456");

        System.out.println(book.getTitle() + " from " + book.getAuthor() + " was successfully registered under the following registration number: " + book.getRegNumber());

    }
}
