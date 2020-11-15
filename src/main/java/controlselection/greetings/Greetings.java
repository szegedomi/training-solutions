package controlselection.greetings;

public class Greetings {

    public String greet(int hour, int minute){
        Integer puff = minute<10 ? Integer.valueOf((String.valueOf(hour) + "0" + String.valueOf(minute))) : Integer.valueOf((String.valueOf(hour) + String.valueOf(minute)));
        if(puff < 501 || puff > 2000){
            return "jó éjt";
        }
        else if(puff < 901){
            return "jó reggelt";
        }
        else if(puff < 1831 ){
            return "jó napot";
        }
        else
            return "jó estét";
    }


}
