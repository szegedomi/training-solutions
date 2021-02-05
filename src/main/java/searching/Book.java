package searching;

public class Book implements Comparable<Book>{

    private int id;
    private String title;
    private String author;


    public Book(int id, String author, String title) {
        this.id = id;
        if(title == null || "".equals(title)){
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
        this.title = title;
        if(author == null || "".equals(author)){
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
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

    @Override
    public int compareTo(Book o){
        if(this.author.compareTo(o.getAuthor()) != 0){
            return this.author.compareTo(o.getAuthor());
        }else{
            return this.title.compareTo(o.getTitle());
        }
    }

    @Override
    public String toString(){
        return Integer.toString(id) + " " + author +" " + title;
    }

}
