package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> books = new ArrayList<>();

    public void add(String book){
        this.books.add(book);
    }

    public List<String> getTitles(){
        return books;
    }

    public List<String> findAllByPrefix(String prefix){
        List<String> result = new ArrayList<>();
        for(String book : this.books){
            if(book.contains(prefix)) {
                result.add(book);
            }
        }
        return result;
    }

    public static void main(String[] args){

        Books books = new Books();

        books.add("Lord of the Rings");
        books.add("The Hobbit");
        books.add("The prisoner of Ascaban");

        System.out.println(books.getTitles().toString());
        System.out.println(books.findAllByPrefix("of").toString());

    }

}
