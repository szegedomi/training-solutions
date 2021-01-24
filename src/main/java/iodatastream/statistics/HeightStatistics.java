package iodatastream.statistics;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HeightStatistics {

    public void saveHeights(List<Integer> heights, Path path){

        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))){
            dos.writeUTF("Lista mérete: " );
            dos.writeInt(heights.size());
            dos.writeUTF("\n" );
            for(Integer h : heights){
                dos.writeInt(h);
            }

        }catch(IOException ioe){
            throw new IllegalStateException("Cannot write file", ioe);
        }

    }

}
