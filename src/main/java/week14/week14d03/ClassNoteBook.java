package week14.week14d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassNoteBook {

    private List<Student> students = new ArrayList<>();

    public ClassNoteBook(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public List<Student> sortNotebook(){
        List<Student> result = this.students;
        Collections.sort(result, new SortByName());
        return result;
    }

    public static void main(String[] args) {

        ClassNoteBook cnb = new ClassNoteBook(Arrays.asList(new Student("Bela"), new Student("Geza"), new Student("Cili")));
        List<Student> sorted = cnb.sortNotebook();
        for(Student student : sorted){
            System.out.println(student.getName());
        }

    }

}
