package vaccination;

import java.time.LocalDateTime;

public class Citizen {

    private int id;
    private String name;
    private String zip;
    private int age;
    private String email;
    private String taj;
    private int number_of_vaccination;
    private LocalDateTime last_vaccination;

    public Citizen(String name, String zip, int age, String email, String taj) {
        this.name = name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getZip() {
        return zip;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public int getNumber_of_vaccination() {
        return number_of_vaccination;
    }

    public LocalDateTime getLast_vaccination() {
        return last_vaccination;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber_of_vaccination(int number_of_vaccination) {
        this.number_of_vaccination = number_of_vaccination;
    }

    public void setLast_vaccination(LocalDateTime last_vaccination) {
        this.last_vaccination = last_vaccination;
    }
}
