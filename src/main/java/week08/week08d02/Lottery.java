package week08.week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Lottery {

    public List<Integer> getNumbers(){
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        Integer n;
        for (int i = 0; i < 5; i++){
            do{
                n = random.nextInt(91);
            }while(numbers.contains(n));
            numbers.add(n);
        }
        return numbers;
    }

}
