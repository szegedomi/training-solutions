package week08.week08d04;

public class Trainer implements CanMark{

    private CanMark canmark;

    public Trainer(CanMark canmark) {
        this.canmark = canmark;
    }

    public int giveMark(){
        return canmark.giveMark();
    }

}
