/*
* COMENTARIO:
*/
public abstract class Character {
    // Features
    private String name;
    private int livePoints;
    private int baseAttack;
    protected int baseMana;

    // Builder
    public Character(String name, int livePoints, int baseAttack, int baseMana) {
        this.name = name;
        this.livePoints = livePoints;
        this.baseAttack = baseAttack;
        this.baseMana = baseMana;
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

    public int getBaseMana() {
        return baseMana;
    }

    public void setMana(int mana) {
        baseMana += mana;
    }

    public void takeDamage(int damage) {
        if (livePoints - damage < 0) {
            livePoints = 0;
        } else {
            livePoints -= damage;
        }
    }

    public void heal() {
        this.livePoints += 10;
        System.out.println(this.getName() + " usó una poción y recuperó 10 puntos de vida.");
        System.out.println("La vida actual de " + this.getName() + " es: " + this.livePoints);
    }
}