import java.util.* ;
import java.io.*; 
public class P21 {
	public static long evenSumTillN(int n) {
		long sum = 0;
		for(int i = 0; i <= n; i++){
			
			if(i%2 == 0){
				sum = sum + i;
			}
		    
		}
		return sum;
	}
}