package week14.week14d01;

import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names){
        Map<Character, List<String>> result = new HashMap<>();

        for(String name : names){
            if(!result.containsKey(name.charAt(0))){
                result.put(name.charAt(0), new ArrayList<>(Arrays.asList(name)));
            }else {
                result.get(name.charAt(0)).add(name);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Olga", "Abraham", "Magdolna")));
    }

}
