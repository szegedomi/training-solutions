package week06.week06d05;

public class Biscuit {

    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public static Biscuit of(BiscuitType type, int gramAmount){
        return new Biscuit(type, gramAmount);
    }

    @Override
    public String toString(){
        return "Biscuit type: " + this.type + " and grams of a unit is: " + this.gramAmount + " g.";
    }


}
