/**
 * Read the keyboard input from the console
 */
public class KeyboardRead {
    public static void main(String[] args)
            throws java.io.IOException { // Because System.in.read( ) is being used, the program must specify the throws
                                         // java.io.IOException clause. This line is necessary to handle input errors.
        char ch;
        System.out.println("Press a key followed by ENTER");
        ch = (char) System.in.read(); // returns int so the cast is required

        System.out.println("Your key is " + ch);
    }

}
