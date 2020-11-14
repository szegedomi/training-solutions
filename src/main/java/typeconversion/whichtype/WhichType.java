package typeconversion.whichtype;

import java.util.ArrayList;
import java.util.List;

public class WhichType {

    public List<Type> whichType(String s){
        List<Type> result = new ArrayList<>();
        for (Type type : Type.values()) {
            Long value = Long.parseLong(s);
            if(value > type.getMinValue() && value < type.getMaxValue())
            {
                result.add(type);
            }
        }
        return result;

    }

    public static void main(String[] args) {

        WhichType whichType = new WhichType();
        System.out.println(whichType.whichType(Long.toString(Long.MAX_VALUE - 2)));
        System.out.println(whichType.whichType(Long.toString((long)Integer.MAX_VALUE - 2)));
        System.out.println(whichType.whichType(Long.toString((long)Short.MAX_VALUE - 2)));
        System.out.println(whichType.whichType(Long.toString((long)Byte.MAX_VALUE - 2)));
        System.out.println(whichType.whichType(Long.toString(0)));
    }

}
