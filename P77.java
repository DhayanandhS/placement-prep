import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++){
		    int x = sc.nextInt();
		    if(x < 67 || x > 45000){
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		}
	}
}

