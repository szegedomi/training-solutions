package enumtype.week;

import static enumtype.week.DayType.HOLYDAY;
import static enumtype.week.DayType.WORKDAY;

public enum Day {

    MONDAY(WORKDAY), TUESDAY(WORKDAY), WEDNESDAY(WORKDAY), THURSDAY(WORKDAY), FRIDAY(WORKDAY), SATURDAY(HOLYDAY), SUNDAY(HOLYDAY);

    private DayType dayType;

    Day(DayType dayType){
        this.dayType = dayType;
    }

    public DayType getDayType() {
        return dayType;
    }
}
