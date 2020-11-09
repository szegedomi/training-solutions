package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    static String numberOfDaysAsString(){
        int[] numberofdays = {31,28,31,30,31,30,31,31,30,31,30,31};
        return Arrays.toString(numberofdays);
    }

    List<String> daysOfWeek(){
        List<String> d = new ArrayList<String>();
        d.add("hetfo");
        d.add("kedd");
        d.add("szerda");
        d.add("csutortok");
        d.add("pentek");
        d.add("szombat");
        d.add("vasarnap");
        return d;
    }

    static boolean wonLottery(int[] a, int[] b){
        int[] c=Arrays.copyOf(a, a.length);
        int[] d=Arrays.copyOf(b, b.length);
        Arrays.sort(c);
        Arrays.sort(d);
        return Arrays.equals(c,d);
    }

    public static void main(String[] args) {
        String numberOfDays = numberOfDaysAsString();
        System.out.println(numberOfDays);

        int[] a ={0,1,2,3,4,5};
        int[] b ={1,2,3,3,5,0};
        System.out.println(wonLottery(a,b));
        System.out.println(Arrays.toString(b));
    }

}
