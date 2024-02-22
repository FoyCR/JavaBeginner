/**
 * Difference between short-circuit and not short-circuit logical operator
 * Side effects can be important
 */
class SideEffects {
    public static void main(String[] args) {
        int i;
        i = 0;

        System.err.println("Before 'if' statements executed, i = " + i);

        // Here i is still incremented even though the if statement fail because the & operator is not a short-circuit type 
        if (false & (++i < 100)) 
            System.err.println("This won't be displayed");
        
        System.err.println("'if' statement executed, i = "+ i);

        // Here i is not incremented because the short-circuit operator && skips it
        if (false && (++i < 100))
            System.err.println("ths won't be displayed");
        
        System.err.println("Second 'if' statement executed, i =  "+ i ); //remains as 1!



    }
}