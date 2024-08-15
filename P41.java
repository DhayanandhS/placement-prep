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
		    int s = sc.nextInt();
		    int []a = new int[s];
		    
		    for(int k=0; k<s; k++){
		        a[k]=sc.nextInt();
		    }
		    
		    int cnt = 0;
		    for(int j = 0; j < s; j++){
		        if(a[j] >= 1000){
		            cnt += 1;
		        }
		    }
		    System.out.println(cnt);
		}
	}
}
