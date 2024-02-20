/*
 * Demostrate dynamic initialization
 */
public class DinInitialization {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        //dynamically initialize volumne
        double volume = 3.1416 * Math.sqrt(radius) * height;
        System.out.println("Volumne is "+ volume);
    }
}
