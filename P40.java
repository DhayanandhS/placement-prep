import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int []a=new int[4];
		    for(int i=0;i<4;i++)
		    a[i]=sc.nextInt();
		    Arrays.sort(a);
		    if(a[0]+a[1]+a[2]<a[3]) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
