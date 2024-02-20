/**
 * Demonstrate automatic conversion on assignment
 */
public class LongToDouble {
    public static void main(String[] args) {
        long L = 1_456_5000_780L;
        double D = L; //Automatic conversion
        //L = D; // Type mismatch error. there is no automatic conversion from double to long, since this is not a widening conversion

        System.out.println("L(Long) and D (Double) " + L + " " + D);
    }

}
