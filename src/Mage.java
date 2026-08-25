public class Mage extends Character {

    // Builder
    public Mage(String name, int livePoints, int baseAttack) {
        super(name, livePoints, baseAttack);
    }

    // Method
    @Override
    public void attack(Character target) {
        if (target.getLivePoints() > 0) {
            System.out.println("Tu mago " + this.getName() + " ataco a " + target.getName());
            target.takeDamage(this.getBaseAttack());
        } else {
            System.out.println(target.getName() + " no tiene vida");
        }
    } 
}