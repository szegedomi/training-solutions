package methoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(Time time){
        this(time.getHours(), time.getMinutes(), time.getSeconds());
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time){
        return time.getHours()==this.hours && time.getMinutes()==this.minutes && time.getSeconds()==this.seconds;
    }

    public boolean isEqual(int hours, int minutes, int seconds){
        return hours==this.hours && minutes==this.minutes && seconds==this.seconds;
    }

    public boolean isEarlier(Time time){
        if(time.getHours() < this.hours){
            return true;
        }
        if(time.getMinutes() < this.minutes){
            return true;
        }
        if(time.getSeconds() < this.seconds){
            return true;
        }
        return false;
    }

    public  boolean isEarlier(int hours, int minutes, int seconds){
        if(hours < this.hours){
            return true;
        }
        if(minutes < this.minutes){
            return true;
        }
        if(seconds < this.seconds){
            return true;
        }
        return false;
    }

}
