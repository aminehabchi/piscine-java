
public class Templar extends Character implements Healer, Tank {

    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public void heal(Character c) {
        c.setCurrentHealth(c.getCurrentHealth() + healCapacity);
        if (c.getCurrentHealth() > c.getMaxHealth()) {
            c.setCurrentHealth(c.getMaxHealth());
        }
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {
        if (super.getCurrentHealth() == 0) {
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.", super.getName(), getShield(), healCapacity);
        }

        return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                super.getName(), super.getCurrentHealth(), healCapacity, getShield());
    }

}
