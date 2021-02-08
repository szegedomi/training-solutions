package methodstructure;

public class BodyMass {

    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassIndex(){
        return this.weight/(this.height * this.height);
    }

    public BmiCategory body(){
        if(this.bodyMassIndex() > 25){
            return BmiCategory.OVERWEIGHTED;
        }
        else if(this.bodyMassIndex() < 18.5){
            return BmiCategory.UNDERWEIGHTED;
        }
        return BmiCategory.NORMAL;
    }

    public boolean isThinnerThan(BodyMass bmi2){
        return this.bodyMassIndex() < bmi2.bodyMassIndex();
    }

}
