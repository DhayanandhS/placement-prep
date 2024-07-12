public class P5 {
    public static int countDigits(int n){
        int count = 0;
        int currentDigit = 0;
        while(n>0){
            currentDigit = n % 10;
            n = n / 10;
            count = count + 1;
        }
        return count;     
    }
}
