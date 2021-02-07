package collectionsclass;

import java.util.Collections;
import java.util.List;

public class CollectionManager {

    private List<Book> library;

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> createUnmodifiableLibrary(){
        return Collections.unmodifiableList(this.library);
    }

    public List<Book> reverseLibrary(){
        List<Book> result = this.library;
        Collections.reverse(result);
        return result;
    }

    public Book getFirstBook(){
        List<Book> result = this.library;
        Collections.sort(result);
        return result.get(0);
    }

    public Book getLastBook(){
        List<Book> result = this.library;
        Collections.sort(result);
        return result.get(result.size()-1);
    }

}
