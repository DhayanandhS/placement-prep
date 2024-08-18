import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner Days = new Scanner(System.in);
        int X = Days.nextInt();
        int Y = Days.nextInt();
        int totaldays = 7;
        System.out.println(totaldays - X - Y);
	}
}