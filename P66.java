import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
	    // wrtie your code here;
		int temp = num;
		int res = 0;
		int nod = String.valueOf(num).length();

		while(temp != 0){
			int digit = temp % 10;
			res += Math.pow(digit, nod);
			temp = temp / 10;
		}

		if(res == num){
			return true;
		}
		return false;
	}
}