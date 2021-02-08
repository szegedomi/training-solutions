package controladvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duplicates {



    public List<Integer> find(List<Integer> integers) {
        List<Integer> result = new ArrayList<>();
        Collections.sort(integers);
        if (integers.size() < 2)
            return result;
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) == integers.get(i - 1)) {
                result.add(integers.get(i));
            }
        }
        return result;
    }

}
