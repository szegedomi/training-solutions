package enumtype.unit;

import java.math.BigDecimal;

public class UnitConverterMain {

    public static void main(String[] args) {

        UnitConverter unitConverter = new UnitConverter();

        System.out.println(unitConverter.convert(new BigDecimal("1234"), LengthUnit.millimeter, LengthUnit.foot).toString());

        System.out.println(unitConverter.siUnits().toString());

    }

}
