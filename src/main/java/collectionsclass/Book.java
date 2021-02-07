package collectionsclass;

public class Book implements Comparable<Book>{

    private int id;
    private String author;
    private String title;

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book other){
        return this.id-other.getId();
    }

    @Override
    public boolean equals(Object other){
        Book book = (Book) other;
        return this.id == book.getId();
    }

    @Override
    public String toString() {
        return id + " " + author + " " + title;
    }

    @Override
    public int hashCode() {
        return id;
    }


}
