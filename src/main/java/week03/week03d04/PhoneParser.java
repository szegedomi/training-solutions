package week03.week03d04;

public class PhoneParser {

    public Phone parse(String phone){
        return new Phone(phone.split("-")[0].toString(), phone.split("-")[0].toString());
    }

}
