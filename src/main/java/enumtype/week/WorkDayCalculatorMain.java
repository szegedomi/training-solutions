package enumtype.week;

import java.util.List;

public class WorkDayCalculatorMain {

    public static void main(String[] args) {


        List<DayType> dayTypes = new WorkDayCalculator().dayTypes(Day.MONDAY,10);
        System.out.println(dayTypes.toString());


    }

}
