/**
 * Stop the loop statement pressing the 's' key
 */
public class StopLoopWithKeyboard {
    public static void main(String[] args)
            throws java.io.IOException {
        int i;

        System.out.println("Press 'S' to stop");

        for (i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Pass #" + i);
        }
    }
}
