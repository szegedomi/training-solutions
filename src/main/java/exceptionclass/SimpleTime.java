package exceptionclass;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        if(hour > 23 || hour < 0){
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        this.hour = hour;
        if(hour > 59 || hour < 0){
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        this.minute = minute;
    }

    public SimpleTime(String time) {
        if(time == null){
            throw new IllegalArgumentException("Time is nul");
        }
        int hour = Integer.parseInt(time.substring(0,time.indexOf(':')));
        if(hour > 23 || hour < 0){
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        this.hour = hour;
        int minute = Integer.parseInt(time.substring(time.indexOf(':')+1, time.length()));
        if(hour > 59 || hour < 0){
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString(){
        return String.format("%02d:%02d", hour, minute);
    }

}
