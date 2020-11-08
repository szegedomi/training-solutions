package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {

    private LocalDate date;
    private String artist;
    private LocalTime startTime;
    private LocalTime endTime;

    public Performance(LocalDate date, String artist, LocalTime startTime, LocalTime endTime) {
        this.date = date;
        this.artist = artist;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void getInfo(){
        System.out.println(this.artist + ": " + this.date + " " + this.startTime + "-" + this.endTime);
    }

}
