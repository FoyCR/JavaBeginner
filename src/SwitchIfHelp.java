
/**
 * Display help for if or switch statements
 * Demonstrate the use of switch statements
 */
public class SwitchIfHelp {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;

        // Building Menu
        System.out.println("Show me help on: ");
        System.out.println("    1. If");
        System.out.println("    2. Switch");
        System.out.print("Chose one:");
        choice = (char) System.in.read();
        System.out.println(" \n");

        // evaluating choice
        switch (choice) {
            case '1':
                System.out.println("The if: \n");
                System.out.println("if (condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The traditional switch: \n");
                System.out.println("switch (expression): ");
                System.out.println("    case constant:");
                System.out.println("        statement sequence;");
                System.out.println("        break;");
                System.out.println("    // . . .");
                System.out.println("}");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
