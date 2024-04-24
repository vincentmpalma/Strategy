package Abilities;

import Monsters.Monster;

public interface Attack extends Ability{

    /**
     * interface method for attack method
     * @param monster the target of the attack
     * @return null (for now)
     */
     Integer attack (Monster monster);
}
