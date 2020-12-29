package interfacestaticmethodes;

import java.util.List;

public interface Valued {

    double getValue();

    static double sum(List<Valued> valueds){
        double result = 0;
        for(Valued item : valueds){
            result += item.getValue();
        }
        return result;
    }

}
