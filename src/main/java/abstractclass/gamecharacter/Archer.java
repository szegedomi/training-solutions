package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character{

    private int numberOfArrows = 100;

    public Archer(Point position, Random random) {
        super(position, random);
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public int getActualSecondaryDamage(){
        return getRandom().nextInt(5)+1;
    }

    private void shootingAnArrow(Character enemy) {
        numberOfArrows--;
        hit(enemy, getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
