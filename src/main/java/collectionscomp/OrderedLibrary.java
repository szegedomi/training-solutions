package collectionscomp;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class OrderedLibrary {

    private List<Book> libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle(){
        List<Book> result = new ArrayList<>(this.libraryBooks);
        Collections.sort(result);
        return result;
    }

    public List<Book> orderedByAuthor(){
        List<Book> result = new ArrayList<>(this.libraryBooks);
        Collections.sort(result, new AuthorComparator());
        return result;
    }

    public List<String> orderedByTitleLocale(Locale locale){

        List<String> result = new ArrayList<>();
        for(Book book : libraryBooks){
            result.add(book.getTitle());
        }

        Collator hunColl = Collator.getInstance(locale);
        Collections.sort(result, hunColl);
        return result;

    }



}
