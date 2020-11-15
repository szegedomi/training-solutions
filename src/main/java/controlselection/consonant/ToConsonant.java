package controlselection.consonant;

import java.util.ArrayList;
import java.util.List;

public class ToConsonant {

    public char convertToConsonant(char kar){
        List<Character> chars =new ArrayList<>();
        chars.add('a');
        chars.add('e');
        chars.add('i');
        chars.add('o');
        chars.add('u');
        if(chars.contains(kar)){return ++kar;}
        else
            return kar;
    }

}
