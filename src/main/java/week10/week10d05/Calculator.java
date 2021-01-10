package week10.week10d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public int[] findMinMaxSum(int[] arr){
        if(arr.length < 4){
            throw new IllegalArgumentException("Please provide an int array with at least 4 elements!");
        }
        boolean ordered = false;
        int numChange = 0;
        int puffer = 0;
        while(ordered == false){
            for(int i = 0; i < arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    puffer = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=puffer;
                    numChange++;
                }
            }
            if(numChange ==0){
                ordered = true;
            }
            numChange = 0;
        }
        int minSum = arr[0]+arr[1]+arr[2]+arr[3];
        int maxSum = arr[arr.length-4]+arr[arr.length-3]+arr[arr.length-2]+arr[arr.length-1];
        int[] result = new int[2];
        result[0]=minSum;
        result[1]=maxSum;
        return result;
    }

    public static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your number separated with whitespaces (example: 1 5 43 21 6 76)");
        String scan = scanner.nextLine();

        scanner = new Scanner(scan);
        List<Integer> arr = new ArrayList<>();
        while(scanner.hasNext()){
            arr.add(scanner.nextInt());
        }

        int[] result = new Calculator().findMinMaxSum(convertIntegers(arr));
        System.out.println("MinSum: " + result[0]);
        System.out.println("MaxSum: " + result[1]);

    }

}
