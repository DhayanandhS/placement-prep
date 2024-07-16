public class P20 {
    static final int MOD = 1000000007;
    public static int power(int N, int R){
        long result = 1;
        long base = N % MOD;

        while (R > 0) {
            // If R is odd, multiply base with result
            if ((R & 1) == 1) {
                result = (result * base) % MOD;
            }
            // R must be even now
            R = R >> 1; // Divide R by 2
            base = (base * base) % MOD; // Square the base
        }

        return (int)result;
    }
}
