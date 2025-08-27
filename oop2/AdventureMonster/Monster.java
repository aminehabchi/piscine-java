
public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        if (super.getCurrentHealth() > 0) {
            return super.getName() + " is a monster with " + String.valueOf(super.getCurrentHealth()) + " HP";
        }
        return super.getName() + " is a monster and is dead";

    }

}
