package week06.week06d01;

import java.util.List;

public class ListSelector {

    public String evenSelector(List<String> strings){
        StringBuilder str_result = new StringBuilder();
        str_result.append("[");
        if (strings == null){
            throw new IllegalArgumentException("Not supported input!");
        }
        int i = 0;
        for(String str : strings){
            if (i % 2 == 0){
                str_result.append(str);
            }
            i++;
        }
        if ("[".equals(str_result.toString())){
            return "";
        }
        return str_result.append("]").toString();
    }

}
