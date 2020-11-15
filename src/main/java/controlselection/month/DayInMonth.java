package controlselection.month;

public class DayInMonth {

    public int numberOfDays(int year, String month){
        month = month.toLowerCase();
        switch (month){
            case "január":
                return 31;
            case "március":
                return 31;
            case "május":
                return 31;
            case "júliusr":
                return 31;
            case "augusztus":
                return 31;
            case "október":
                return 31;
            case "december":
                return 31;
            case "április":
                return 30;
            case "június":
                return 30;
            case "szeptember":
                return 30;
            case "november":
                return 30;
            case "február":
                if(year % 4 != 0 || (year % 4 == 0 && year % 100 ==0 && year % 400 != 0)){return 28;}
                else if(year % 4 == 0){return 29;}
                else{return 28;}
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }

    }

}
