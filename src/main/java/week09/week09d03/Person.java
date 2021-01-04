package week09.week09d03;

import java.awt.print.PrinterAbortException;
import java.util.Random;

public class Person {

    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }

    public void setPresent(){
        Random random = new Random();
        if(age < 14){
            int index = random.nextInt(Present.values().length-1)+1;
            this.present = Present.values()[index];
        }else{
            this.present = Present.values()[random.nextInt(Present.values().length-1)];
        }
    }
}
