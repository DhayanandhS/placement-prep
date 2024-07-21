import java.util.* ;
import java.io.*; 
public class P30 {
	public static long evenSumTillN(int n) {
		long sum = 0;

		for(int i = 0; i <= n; i+=2){
			sum = sum + i;
		}

		return sum;
	}
}