/**
 * Demonstrate the use of cast if we want te fractional part, otherwise the
 * result will be int (truncated)
 */
public class CastPromDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " / 3 = " + (i / 3));
            System.out.println(i + " / 3 with fractions = " + (double) (i) / 3); // if cast is apply to the expression
                                                                                 // (double)(i) / 3) the result will be
                                                                                 // already truncateF
            System.out.println();
        }

    }

}
