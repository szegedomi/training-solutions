package enumtype.unit;

import java.math.BigDecimal;

public enum LengthUnit {

    millimeter(true, new BigDecimal("1")), centimeter(true, new BigDecimal("10")), meter(true, new BigDecimal("1000")), yard(false, new BigDecimal("250")), foot(false, new BigDecimal("400")), inch(false, new BigDecimal("25"));

    private boolean SI;
    private BigDecimal mm;

    LengthUnit(boolean SI, BigDecimal mm) {
        this.SI = SI;
        this.mm = mm;
    }

    public boolean isSI() {
        return SI;
    }

    public BigDecimal getMm() {
        return mm;
    }
}
