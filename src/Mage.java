public class Mage extends Character {

    // Builder
    public Mage(String name, int livePoints, int baseAttack, int baseMana) {
        super(name, livePoints, baseAttack, baseMana);
    }

    // Method
    @Override
    public void attack(Character target) {
        if (this.getBaseMana() < 5) {
            System.out.println("El mana de " + this.getName() + " es de 0 y no puede atacar.");
            target.takeDamage(1);
            return;
        } else {
            if (target.getLivePoints() > 0) {
                System.out.println("Tu mago " + this.getName() + " ataco a " + target.getName());
                
                // Critical Damage
                int danoFinal = this.getBaseAttack();

                if (Math.random() < 0.20) {
                    danoFinal = danoFinal * 2;
                    System.out.println(this.getName() + " dio un GOLPE CRITICO!");
                }

                target.takeDamage(danoFinal);
                System.err.println(target.getName() + " recibio " + this.getBaseAttack() + " de daño");
                // End Critical Damage

                System.out.println("La vida actual de " + target.getName() + " es: " + target.getLivePoints());
                this.baseMana -= 5;
            } else {
                System.out.println(target.getName() + " llego a " + target.getLivePoints() + " puntos de vida");
                System.out.println(target.getName() + " esta muerto");
            }
        }    
    } 
}