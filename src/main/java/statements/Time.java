package statements;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getInMinutes() {
        return this.hours * 60 + this.minutes;
    }

    public int getInSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    public boolean earlierThan(Time time){
        return this.getInSeconds()<time.getInSeconds() ? true : false;
    }

    public String toString(){
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }

}