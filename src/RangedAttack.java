public class RangedAttack implements Attack{

    Monster attacker;


    /**
     * set what the attacker is
     * @param attacker the Monster doing the attacking
     */
    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }


    /**
     * print out who range attacked who
     * @param target the things being attacked
     * @return null
     */
    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a range attack on " + target;
        System.out.println(message);
        return null;
    }

}
