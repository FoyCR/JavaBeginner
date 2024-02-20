/**
 * Demonstrate casting
 */
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // cast double to int, truncation will occur
        System.out.println("Integer outcome of x / y = " + i);

        i = 100;
        b = (byte) i; // cast int to byte. No loss here a byte can hold the value 100
        System.out.println("value of i = " + i + " value of b = " + b);

        i = 300;
        b = (byte) i;// cast int to byte. Loss occurs here a byte can not hold the value 300
        System.out.println("value of i = " + i + " value of b = " + b);

        b = 88; // ASCII code for 'X'
        ch = (char) b; // cast byte to char
        System.out.println("ch value is " + ch);

    }
}
