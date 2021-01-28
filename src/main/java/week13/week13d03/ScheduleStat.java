package week13.week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ScheduleStat {

    private List<ScheduleItem> scheduleItems = new ArrayList<>();

    public void readSchedule(Path file){

        try(BufferedReader br = Files.newBufferedReader(file)){
            String teacher;
            String subject;
            String className;
            int hours;
            while((teacher = br.readLine()) != null){
                subject = br.readLine();
                className = br.readLine();
                hours = Integer.parseInt(br.readLine());
                scheduleItems.add(new ScheduleItem(teacher, subject, className, hours));
            }

        }catch(IOException ioe){
            throw new IllegalStateException("Cannot read file!", ioe);
        }
    }

    public int hoursOfATeacher(String teacher){
        int result = 0;
        for(ScheduleItem scheduleItem : scheduleItems){
            if(scheduleItem.getTeacher().equals(teacher)){
                result += scheduleItem.getHours();
            }
        }
        return result;
    }


    public static void main(String[] args) {

        ScheduleStat scheduleStat = new ScheduleStat();

        scheduleStat.readSchedule(Path.of("src/main/resources/beosztas.txt"));

        System.out.println(scheduleStat.hoursOfATeacher("Cet Celina"));

    }

}
