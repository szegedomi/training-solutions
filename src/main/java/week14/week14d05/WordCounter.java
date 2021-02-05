package week14.week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public Map<String, Integer> countWords(Path file, String... words){
        Map<String, Integer> result = initialize(words);
        try(BufferedReader br = Files.newBufferedReader(file, Charset.forName("windows-1250"))) {
            String line;
            while((line=br.readLine()) != null){
                System.out.println(line);
                for(String word : words){
                    if(line.contains(word)){
                        result.replace(word, result.get(word)+1);
                    }
                }
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("");
        }
        return result;
    }

    private Map<String, Integer> initialize(String[] words){
        Map<String, Integer> result = new HashMap<>();
        for(String word : words){
            result.put(word, 0);
        }
        return result;
    }

    public static void main(String[] args) {

        WordCounter wc = new WordCounter();
        System.out.println(wc.countWords(Path.of("hachiko.txt"),"Hachiko","pályaudvar","jó", "haza"));
    }

}
