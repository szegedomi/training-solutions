package ioconvert;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream os, List<String> shoppingList){
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        try(bw){
            for(String s : shoppingList){
                bw.write(s);
                bw.newLine();
            }
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot write to stream", ioe);
        }

    }

    public List<String> loadShoppingList(InputStream is){
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        List<String> result = new ArrayList<>();
        try(br){
            String line;
            while((line = br.readLine()) != null){
                result.add(line);
            }
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot write to stream", ioe);
        }
        return result;
    }

}
