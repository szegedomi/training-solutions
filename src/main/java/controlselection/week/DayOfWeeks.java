package controlselection.week;

public class DayOfWeeks {

    public String whichDay(String day){
        day = day.toLowerCase();
        switch (day){
            case "hétfő":
                return "hét eleje";
            case "kedd":
                return "hét közepe";
            case "szerda":
                return "hét közepe";
            case "csütörtök":
                return "hét közepe";
            case "péntek":
                return "majdnem hétvége";
            case "szombat":
                return "hét vége";
            case "vasárnap":
                return "hét vége";
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
    }

}
