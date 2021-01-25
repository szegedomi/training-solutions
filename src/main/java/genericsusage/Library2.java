package genericsusage;

import java.util.List;

public class Library2 {

    public Book getFistBook(List<Book> books){
        if(books == null){
            throw new NullPointerException("Argument is null!");
        }
        if(books.isEmpty()){
            throw new IllegalArgumentException("Argument is empty!");
        }
        return books.get(0);
    }

}
