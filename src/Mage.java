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
            System.err.println(target.getName() + " recibio " + this.getBaseAttack() + " de daño");
            System.out.println("La vida actual de " + target.getName() + " es: " + target.getLivePoints());
        } else {
            System.out.println(target.getName() + " llego a " + target.getLivePoints() + " puntos de vida");
            System.out.println(target.getName() + " esta muerto");
        }
    } 
}