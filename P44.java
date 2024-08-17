import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        
        // Check if input is available
        if (sc.hasNextLine()) {
            String str = sc.nextLine();
            
            if (str.length() > 7) {
                System.out.println(str.charAt(6));
            } else {
                System.out.println("The input string is too short.");
            }
        } else {
            System.out.println("No input provided.");
        }

        sc.close();
	}
}
