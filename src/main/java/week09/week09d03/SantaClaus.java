package week09.week09d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SantaClaus {

    private List<Person> personList = new ArrayList<>();

    public SantaClaus(List<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person ps){
        this.personList.add(ps);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void getThroughChimneys(){
        for(Person person : personList){
            person.setPresent();
        }
    }

}
