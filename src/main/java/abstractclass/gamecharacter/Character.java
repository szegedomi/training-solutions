package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public Point getPosition() {
        return position;
    }

    public Random getRandom() {
        return random;
    }

    public boolean isAlive(){
        return hitPoint > 0;
    }


    protected int getActualPrimaryDamage(){
        return random.nextInt(10)+1;
    }

    private int getactualDefence(){
        return random.nextInt(6);
    }

    protected void hit(Character enemy, int damage){

        if(enemy.getactualDefence() < damage){
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy){
        hit(enemy, getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff){
        hitPoint -= diff;
    }

    public abstract void secondaryAttack(Character enemy);


}
