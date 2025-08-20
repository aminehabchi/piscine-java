public class Character {
    private final int maxHealth;
    private final String name;
    private int currentHealth;

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public String getName() {
        return this.name;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.name = name;
        this.currentHealth = maxHealth;
    }

    @Override
    public String toString() {
        if (currentHealth == 0) {
            return name + " : KO";
        }
        return name + " : " + currentHealth + "/" + maxHealth;
    }

    public void takeDamage(int damage) {
        this.currentHealth -= damage;
        if (this.currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public void attack(Character charr) {
        charr.takeDamage(9);
    }
}
