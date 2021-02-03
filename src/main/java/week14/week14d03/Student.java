package week14.week14d03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    private String name;
    private Map<String, List<Integer>> marks = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getMarks() {
        return marks;
    }

    public void addMark(String subject, int mark) {

        List<Integer> result = this.marks.get(subject);
        result.add(mark);
        this.marks.put(subject, result);

    }

}
