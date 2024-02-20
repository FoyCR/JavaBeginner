public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;

        if (a < b) System.out.println("a is less than b");
        if (a == b) System.out.println("you won't see this");
        System.err.println();

        c = a - b; //c = -1

        System.err.println("c contains " + c );
        if (c >= 0) System.err.println("c is non-negative");
        if (c < 0) System.err.println("c is negative");
        System.err.println();

        c = b -a; // c = 1
        System.err.println("c contains " + c );
        if (c >= 0) System.err.println("c is non-negative");
        if (c < 0) System.err.println("c is negative");
        System.err.println();
    }
    
}
