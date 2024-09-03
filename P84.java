import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
        int test, Alice, Bob, Charlie;
        test = in.nextInt();
        while (test-- > 0) {
            Alice = in.nextInt();
            Bob = in.nextInt();
            Charlie = in.nextInt();
            if(Bob>=Alice && Bob>=Charlie){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
            }
        }

	}
}
