package week13.week13d03;

public class ScheduleItem {

    private String teacher;
    private String subject;
    private String className;
    private int hours;

    public ScheduleItem(String teacher, String subject, String className, int hours) {
        this.teacher = teacher;
        this.subject = subject;
        this.className = className;
        this.hours = hours;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassName() {
        return className;
    }

    public int getHours() {
        return hours;
    }
}
