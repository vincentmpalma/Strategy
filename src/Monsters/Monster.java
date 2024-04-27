package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

//github repo: https://github.com/vincentmpalma/Strategy
public abstract class Monster {
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String,Integer>items;

    Integer agi = 10;
    Integer def = 10;
    Integer str = 10;
    Attack attack;

    public Monster(Integer maxHP, Integer xp, HashMap<String,Integer>items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getAgi() {
        return agi;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    public Integer attackTarget(Monster target){
        Integer damage = attack.attack(target);
        target.takeDamage(damage);
        return damage;
    }

    boolean takeDamage(Integer damage){

        if(damage > 0){
            hp -= damage;
            System.out.println("The creature was hit for " + damage + " damage");
        }


        if(hp <= 0 ){
            System.out.println("Oh no! the creature has perished");
        }

        System.out.println(this.toString());

        return hp > 0;

    }

    Integer getAttribute(Integer min, Integer max){
        Random random = new Random();
        if(min > max){
            Integer temp = max;
            max = min;
            min = temp;
        }
        return random.nextInt(max-min) + min;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;

        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) && Objects.equals(xp, monster.xp) && Objects.equals(maxHP, monster.maxHP) && Objects.equals(items, monster.items) && Objects.equals(agi, monster.agi) && Objects.equals(def, monster.def) && Objects.equals(str, monster.str) && Objects.equals(attack, monster.attack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHP, items);
    }

    @Override
    public String toString() {
        return hp + "/" + maxHP;
    }
}
