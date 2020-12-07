package introinheritance;

public class BigBoss extends Boss{

    private double bonus;

    public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonus) {
        super(name, address, salary, numberOfEmployees);
        this.bonus = bonus;
        this.raiseSalary(bonus);
    }

    public double getBonus() {
        return bonus;
    }

}
