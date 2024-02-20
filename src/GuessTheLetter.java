/**
 * Little game to guess a letter. demonstrate the use of 'if' sentence and read
 * the user input
 */
public class GuessTheLetter {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'k';
        System.out.println("Do your best guessing a letter between a and z:");
        ch = (char) System.in.read();

        if (ch == answer)
            System.out.println("** Right **");
        else
            System.out.println("...Sorry. You are wrong.");
    }
}
