package week04.week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String word, char c){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == c){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Search s = new Search();
        List<Integer> result = s.getIndexesOfChar("almafa", 'a');
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }

}
