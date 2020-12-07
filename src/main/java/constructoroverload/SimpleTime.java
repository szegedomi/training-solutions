package constructoroverload;

import static java.lang.Math.*;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this.hours = hours;
        this.minutes = 0;
    }

    public SimpleTime(SimpleTime time) {
        this(time.getHours(), time.getMinutes());
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int difference(SimpleTime time) {
        return abs((this.getHours() - time.getHours()) * 60 + this.getMinutes() - time.getMinutes());
    }

    @Override
    public String toString(){
        return "Time is: " + this.getHours() + " hours, " + this.getMinutes() + " minutes.";
    }

}
