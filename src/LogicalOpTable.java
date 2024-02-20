/**
 * Create a table of logical operators
 */
public class LogicalOpTable {
    public static void main(String[] args) {

        // table header
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT(P)"); // \t adds tab spacing

        printLogicalOp(true, true);
        printLogicalOp(true, false);
        printLogicalOp(false, true);
        printLogicalOp(false, false);

    }

    static void printLogicalOp(boolean p, boolean q) {
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
    }
}
