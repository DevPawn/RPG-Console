public class Main {
    public static void main(String[] args) {
        Character guerrero = new Warrior("Pepe", 100, 20);
        Character mage = new Mage("Nami", 400, 60);
        guerrero.attack(mage);
        mage.attack(guerrero);
    }
}
