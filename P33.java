import java.util.*;
import java.lang.*;
import java.io.*;

class P33
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 1; i <= t; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    
		    if( a == 0 && b == 0 && c == 0 && d == 0) System.out.println("IN");
		    else System.out.println("OUT");
		}

	}
}
