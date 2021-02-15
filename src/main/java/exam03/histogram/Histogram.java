package exam03.histogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringWriter;

public class Histogram {

    public String createHistogram(BufferedReader reader){
        StringWriter sw = new StringWriter();
        try(reader){
            String line;
            while((line = reader.readLine()) != null){
                sw.append(writeLine(line));
            }
        }
        catch (IOException ioe) {
            throw  new IllegalStateException("Cannot read file", ioe);
        }
        return sw.toString();
    }

    private String writeLine(String line){
        int numLines = Integer.parseInt(line);
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i < numLines; i++ ){
            sb.append("*");
        }
        sb.append('\n');
        return sb.toString();
    }
}
