package week11.week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordWithChar(List<String> words, char c){

        List<String> result = new ArrayList<>();
        for (String word : words){
            if (word.indexOf(c) >= 0 && word.indexOf(c) <= word.length()){
                result.add(word);
            }
        }
        return result;
    }

}
