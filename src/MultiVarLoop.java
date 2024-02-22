/**
 * Demonstrate multiple variables in a for..loop statement
 */
public class MultiVarLoop {
    public static void main(String[] args) {
        int i, j;
        for (i = 0, j = 10; i <= j; i++, j--) {// note the comma separator
            System.out.println("i and j: " + i + "  " + j);
        }
    }
}
