package week15.week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.Key;
import java.util.*;

public class Quiz {

    List<Question> quiz = new ArrayList<>();


    public List<Question> readFromFile(Path file) {
        List<Question> result = new ArrayList<>();
        try(BufferedReader br = Files.newBufferedReader(file)){
            String line1;
            String line2;
            String[] line2Split;
            while((line1= br.readLine()) != null){
                line2 = br.readLine();
                line2Split = line2.split(" ");
                result.add(new Question(line1, line2Split[0], Integer.parseInt(line2Split[1]), line2Split[2]));
            }
        }
        catch (IOException ioe) {
            throw  new IllegalStateException("Cannot read file!", ioe);
        }
        return result;
    }

    public List<String> questionsOfATopic(String category){
        List<String> questions = new ArrayList<>();
        for(Question question : quiz){
            if(category.equals(question.getCategory())){
                questions.add(question.getQuestion());
            }
        }
        return questions;
    }


    public Question getRandomQuestion(Random random){
        int index = random.nextInt(this.quiz.size());
        return quiz.get(index);
    }

    public Map<String, List<Question>> sortQuestionsByTopic(){
        Map<String, List<Question>> result = new HashMap<>();
        for(Question question : quiz){
            if(!result.containsKey(question.getCategory())){
                result.put(question.getCategory(), new ArrayList<Question>());
                result.get(question.getCategory()).add(question);
            }
            else{
                result.get(question.getCategory()).add(question);
            }
        }
        return result;
    }

    public String categoryWithHighestPoint(){
        Map<String, List<Question>> sorted = sortQuestionsByTopic();
        String categoryMax = "";
        int maxPoint = 0;
        for(String key : sorted.keySet()){
            int point = 0;
            for(Question question : sorted.get(key)){
                point += question.getPoint();
            }
            if(point > maxPoint){
                categoryMax = key;
                maxPoint = point;
            }
        }
        return categoryMax;
    }


}
