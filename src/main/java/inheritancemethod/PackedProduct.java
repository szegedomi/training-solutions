package inheritancemethod;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product{

    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces){
        return super.totalWeight(pieces).add(weightOfBox.multiply(new BigDecimal(String.valueOf( pieces % packingUnit == 0 ? pieces / packingUnit : pieces / packingUnit + 1)))).setScale(getNumberOfDecimals(), RoundingMode.HALF_UP);
    }

}
