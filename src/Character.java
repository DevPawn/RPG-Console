/*
* COMENTARIO:
*/
public abstract class Character {
    // Features
    private String name;
    private int livePoints;
    private int baseAttack;

    // Builder
    public Character(String name, int livePoints, int baseAttack) {
        this.name = name;
        this.livePoints = livePoints;
        this.baseAttack = baseAttack;
    }

    // Method
    public abstract void attack(Character target);

    // Getters
    public String getName() {
        return name;
    }

    public int getLivePoints() {
        return livePoints;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void takeDamage(int damage) {
        if (livePoints - damage < 0) {
            livePoints = 0;
        } else {
            livePoints -= damage;
        }
    }
}