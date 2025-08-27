import java.util.ArrayList;
import java.util.List;

public class Character {

    private final int maxHealth;
    private final String name;
    private int currentHealth;

    private static List<Character> allCharacters = new ArrayList<>();

    public static String printStatus() {
        StringBuilder s = new StringBuilder();
        s.append("------------------------------------------\n");

        if (allCharacters.isEmpty()) {
            s.append("Nobody's fighting right now !\n");
        } else {
            s.append("Characters currently fighting :\n");
            for (Character c : allCharacters) {
                s.append(" - ").append(c.toString()).append("\n");
            }
        }

        s.append("------------------------------------------\n");
        return s.toString();
    }

    public static Character fight(Character c1, Character c2) {
        if (c1.getCurrentHealth() == 0) {
            return c2;
        }
        if (c2.getCurrentHealth() == 0) {
            return c1;
        }
        while (true) {
            c1.attack(c2);
            if (c2.getCurrentHealth() == 0) {
                return c1;
            }
            c2.attack(c1);
            if (c1.getCurrentHealth() == 0) {
                return c2;
            }
        }
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public String getName() {
        return this.name;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
         this.currentHealth=currentHealth;
    }

    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.name = name;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
    }

    @Override
    public String toString() {
        return (currentHealth == 0)
                ? name + " : KO"
                : name + " : " + currentHealth + "/" + maxHealth;
    }

    public void takeDamage(int damage) {
        this.currentHealth -= damage;
        if (this.currentHealth < 0) {
            currentHealth = 0;
        }
    }

    public static void attack(Character charr) {
        charr.takeDamage(9);
    }
}
