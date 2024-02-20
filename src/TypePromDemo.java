/**
 * Type promotion rules:
 * First, all char, byte, and short values are promoted to int.
 * Then, if one operand is a long, the whole expression is promoted to long.
 * If one operand is a float operand, the entire expression is promoted to float.
 * If any of the operands is double, the result is double.
 * Type promotion only affects the evaluation of an expression.
 * 
 * Promotion surprise, a little bit counterintuitive
 */
public class TypePromDemo {
    public static void main(String[] args) {
        byte b = 10;
        int i;

        i = b * b; //byte are promoted to int, the outcome of the expression is int

        b = (byte) (b * b); //again the outcome of the expression is int so a cast is required
        
        System.out.println("i and b: " + i + " " + b);
    }
}
