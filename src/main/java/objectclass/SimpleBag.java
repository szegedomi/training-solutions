package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private List<Object> objects = new ArrayList<>();

    int cursor;

    public SimpleBag() {
        this.cursor = -1;
    }

    public void putItem(Object item){
        objects.add(item);
    }

    public boolean isEmpty(){
        return objects == null || objects.size() == 0;
    }

    public int size(){
        return objects.size();
    }

    public void beforeFirst(){
        cursor = -1;
    }

    public boolean hasNext(){
        return !isEmpty() && cursor < objects.size()-1;
    }

    public Object next(){
        cursor++;
        return objects.get(cursor);
    }

    public boolean contains(Object item){
        return objects.contains(item);
    }

    public int getCursor(){
        return cursor;
    }

}
