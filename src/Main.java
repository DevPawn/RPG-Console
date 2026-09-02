public class Main {
    public static void main(String[] args) {
        Character guerrero = new Warrior("Pepe", 100, 160);
        Character mago = new Mage("Nami", 400, 40);

        while (mago.getLivePoints() > 0 && guerrero.getLivePoints() > 0) {
            guerrero.attack(mago);
            

            if (mago.getLivePoints() <= 0) {
                break;
            }
            mago.attack(guerrero);
            System.out.println("fin del turno");
        }

        if (guerrero.getLivePoints() > 0) {
            System.out.println("Gano " + guerrero.getName());
        } else {
            System.out.println("Gano " + mago.getName());
        }
    }
}