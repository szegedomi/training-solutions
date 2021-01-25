package genericsusage;


import java.util.List;

public class Library {

    public Book getFistBook(List books){
        if(books == null){
            throw new NullPointerException("Argument is null!");
        }
        if(books.isEmpty()){
            throw new IllegalArgumentException("Argument is empty!");
        }
        Object result = books.get(0);
        if(!(result instanceof Book)){
            throw new ClassCastException("Result is not a book!");
        }
        return (Book) result;
    }


}
