package collectionslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount){

        if(lotteryType >= ballCount){
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }

        List<Integer> numbers = fillNumbers(ballCount);

        Collections.shuffle(numbers);

        return numbers.subList(0, lotteryType);

    }


    private List<Integer> fillNumbers( int ballCount){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < ballCount; i++){
            numbers.add(i);
        }
        return numbers;
    }

}
