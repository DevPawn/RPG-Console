public class Warrior extends Character{

    // builder
    public Warrior(String name, int livePoints, int baseAttack) {
        super(name, livePoints, baseAttack);
    }

    // Methods
    @Override
    public void attack(Character target) {
        if (target.getLivePoints() > 0) {
            System.out.println("Tu Guerrero " + this.getName() + " ataco a " + target.getName());
            target.takeDamage(this.getBaseAttack());
        } else {
            System.out.println(target.getName() + " no tiene vida");
        }
    }
}