package iostringwriter;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongWordService {

    public void MainWriter(List<String> words){

        List<String> result = new ArrayList<>();
        StringWriter sw = new StringWriter();

        try (sw) {
            appendLength(words, sw);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
        System.out.println(sw.toString());

    }

    public void appendLength(List<String> words, Writer writer) {
        try {
            for (String word : words) {
                writer.write(word);
                writer.write(", " + word.length() + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public static void main(String[] args) {

        new LongWordService().MainWriter(Arrays.asList("alma", "ezpedigegyhosszúszó", "körte", "barack"));

    }

}
