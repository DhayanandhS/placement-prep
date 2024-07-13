import java.util.* ;
import java.io.*; 
public class P11{
    public static int fibonacciNumber(int n){
        int a = 1, b = 1;
        
        if (n == 1) {
            
            return a; // Add a return statement here to stop further execution
        }
        if (n == 2) {
            
            return b; // Add a return statement here to stop further execution
        }

        int next = 0;

        // Generating the next terms
        for (int i = 3; i <= n; i++) {
            next = (a + b) % 1000000007; // Modulo operation for large numbers
            a = b;
            b = next;
        }

        
        return next;
        
    }
}