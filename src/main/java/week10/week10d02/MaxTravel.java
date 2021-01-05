package week10.week10d02;

import java.util.ArrayList;
import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> list){

        int[] listM = new int[30];
        for (Integer i : list){
            listM[i]++;
        }
        int index = 0;
        int max = 0;
        for ( int i = 0; i < listM.length; i++){
            if(listM[i] > max){
                max = listM[i];
                index = i;
            }
        }
        return index;
    }





}
