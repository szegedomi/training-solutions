package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkDayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numberOfDays){
        List<DayType> result = new ArrayList<>();
        result.add(firstDay.getDayType());
        for (int i=0; i< numberOfDays; i++){
            result.add(nextDay(firstDay).getDayType());
            firstDay = nextDay(firstDay);
        }
        return result;
    }

    private Day nextDay(Day day){
        switch (day.name()) {
            case "MONDAY":
                return Day.TUESDAY;
            case "TUESDAY":
                return Day.WEDNESDAY;
            case "WEDNESDAY":
                return Day.THURSDAY;
            case "THURSDAY":
                return Day.FRIDAY;
            case "FRIDAY":
                return Day.SATURDAY;
            case "SATURDAY":
                return Day.SUNDAY;
            case "SUNDAY":
                return Day.MONDAY;
        }
        return null;
    }

}
