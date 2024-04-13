import java.util.HashMap;

//github repo: https://github.com/vincentmpalma/Strategy
public class Kobold extends Monster{
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Kobold has : hp=" + super.toString();
    }
}
