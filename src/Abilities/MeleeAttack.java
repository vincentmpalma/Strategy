package Abilities;
import Monsters.Monster;

public class MeleeAttack implements Attack{

    Monster attacker;

    /**
     * set what the attacker is
     * @param attacker the Monsters.Monster doing the attacking
     */
    public MeleeAttack(Monster attacker) {
        this.attacker = attacker;
    }


    /**
     * print out who melee attacked who
     * @param target the things being attacked
     * @return null
     */
    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee on " + target;
        System.out.println(message);
        return attacker.getStr() - target.getStr();
    }


}
