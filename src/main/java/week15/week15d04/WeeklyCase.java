package week15.week15d04;

public class WeeklyCase implements Comparable<WeeklyCase>{

    private String week;
    private int cases;

    public WeeklyCase(String week, int cases) {
        this.week = week;
        this.cases = cases;
    }

    public String getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }

    @Override
    public int compareTo(WeeklyCase o) {
        return o.cases-this.cases;
    }

    @Override
    public String toString(){
        return this.week + ": " + this.cases;
    }
}
