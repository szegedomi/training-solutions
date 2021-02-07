package sorting;

public class Book implements Comparable<Book>{

    private  int id;
    private String title;
    private String author;

    public Book(int id, String author, String title) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean equals(Book book) {
        if (this == book) return true;

        return this.id == book.id;
    }

    @Override
    public int compareTo(Book other){
        return this.id - other.getId();
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
