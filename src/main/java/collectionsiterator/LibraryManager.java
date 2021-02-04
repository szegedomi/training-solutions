package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> library = new HashSet<>();

    public LibraryManager(Set<Book> library) {
        this.library = library;
    }

    public Book findBookByRegNumber(int regNumber){
        for(Book book : library){
            if(book.getRegNumber() == regNumber){
                return book;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber){
        Iterator<Book> i = library.iterator();
        int rn;
        while(i.hasNext()){
            rn = i.next().getRegNumber();
            if(rn == regNumber){
                i.remove();
                return rn;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author){
        Set<Book> result = new HashSet<>();
        for(Book book : library){
            if(book.getAuthor().equals(author)){
                result.add(book);
            }
        }
        if(result == null){
            throw new MissingBookException("No books found with regnumber: " );
        }
        return result;
    }

    public int libraryBooksCount(){
        return this.library.size();
    }

}
