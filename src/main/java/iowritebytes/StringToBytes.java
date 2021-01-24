package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {

    public void writeAsBytes(List<String> words, Path path){

        try(BufferedOutputStream bw = new BufferedOutputStream(Files.newOutputStream(path))){

            for(String s : words){
                if(!s.startsWith("_")){
                    bw.write(s.getBytes());
                }
            }

        }catch (IOException ioe){
            throw new IllegalStateException("Cannot write file");
        }

    }

}
