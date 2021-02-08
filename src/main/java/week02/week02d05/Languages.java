package week02.week02d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Languages {

    public static void main(String[] args) {

        List<String> languages = new ArrayList<>(Arrays.asList("Java","Python","JavaScript"));

        for(String language : languages){
            if(5 < language.length()){
                System.out.println(language);
            }
        }


    }

}
