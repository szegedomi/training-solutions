package introexception;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int yearOfBirth) {
        this.name = name;
        if (name == ""){
            throw new IllegalArgumentException("Name input is invalid: " + name);
        }
        this.socialSecurityNumber = ssn;
        if(!(new SsnValidator().isValidSsn(ssn))){
            throw new IllegalArgumentException("Invalid Social Security Number: " + ssn);
        }
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth < 1900){
            throw new IllegalArgumentException("Illegal argument year of birth: " + yearOfBirth);
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
