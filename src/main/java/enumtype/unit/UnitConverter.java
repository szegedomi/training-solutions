package enumtype.unit;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {

    public BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target){
        MathContext m = new MathContext(4);
        return length.multiply(source.getMm().divide(target.getMm())).round(m);
    }

    public List<LengthUnit> siUnits(){
        List<LengthUnit> result = new ArrayList<>();
        for(LengthUnit lengthUnit : LengthUnit.values()){
            if(lengthUnit.isSI()){
                result.add(lengthUnit);
            }
        }
        return result;
    }


}
