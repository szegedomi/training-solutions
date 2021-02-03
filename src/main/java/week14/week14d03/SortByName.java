package week14.week14d03;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

    public int compare(Student a, Student b){
        return a.getName().compareTo(b.getName());
    }

}
