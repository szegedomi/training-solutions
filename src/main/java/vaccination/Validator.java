package vaccination;

import java.text.AttributedString;

public class Validator {

    public boolean isValidMenu(int adat){
        return adat > 0 && adat < 8;
    }

    public boolean isEmpty(String adat){return adat.isEmpty() || adat == null;}

    public boolean isInvalidEmail(String adat){return adat.length() >= 3 && adat.contains("@");}

    public boolean isInvalidAge(int adat) {return adat > 10 && adat < 150;}

    public boolean isInvalidTaj(String adat) {
        if (adat.length() != 9) {
            return true;
        }
        int buffer = 0;
        for (int i = 0; i < 4; i++) {
            buffer += Integer.parseInt(Character.toString(adat.charAt(2 * i))) * 3;
            buffer += Integer.parseInt(Character.toString(adat.charAt(2 * i + 1))) * 7;
        }
        if (buffer % 10 != Integer.parseInt(Character.toString(adat.charAt(8)))) {
            return true;
        }
        return false;
    }

    public boolean isInvalidRecord(String[] adat) {

        return this.isEmpty(adat[0]) || this.isEmpty(adat[1]) || isInvalidEmail(adat[3]) || isInvalidAge(2) || isInvalidTaj(adat[4]);

    }

    public boolean isInvalidVaccineType(String vactype){
        for(VaccinationType vaccinationType : VaccinationType.values()){
            if(vaccinationType.getType().equals(vactype)){
                return false;
            }
        }
        return true;
    }
}
