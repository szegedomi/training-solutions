package abstractclass.gamecharacter;

public class BattleField {

    private int round = 0;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender){
        if(!attacker.isAlive()){
            return false;
        }
        attacker.primaryAttack(defender);
        if(defender.isAlive()){
            attacker.secondaryAttack(defender);
        }
        return defender.isAlive();
    }

    public Character fight(Character one, Character other){
        while(oneHit(one, other)){
            round++;
            if(!oneHit(other, one)){
                break;
            }
        }
        return one.isAlive() ? one : other;

    }

}
