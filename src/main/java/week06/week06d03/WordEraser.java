package week06.week06d03;

import java.util.Scanner;

public class WordEraser {

    public String eraseWord(String words, String word){
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(words).useDelimiter(" ");
        String buffer;
        while (scanner.hasNext()){
                buffer = scanner.next();
                if (!word.equals(buffer)){
                    result.append(buffer + " ");
                }
        }
        return  result.toString().trim();
    }

}
