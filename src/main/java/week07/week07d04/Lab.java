package week07.week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completed = true;
        this.completedAt = completedAt;
    }

    public void complete(LocalDate completedAt){
        this.completed = true;
        this.completedAt = completedAt;
    }

    public void complete(){
        this.completed = true;
        this.completedAt = LocalDate.now();
    }

    @Override
    public String toString(){
        return this.completed ? "Task: " + this.title + " was completed at " + this.completedAt.toString() : "Task: " + this.title + " is not completed yet.";
    }

}
