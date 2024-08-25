import java.util.* ;
import java.io.*; 
public class Solution{
	public static String convertString(String str) {
            // Write your code here
            char[] ch= str.toCharArray();

            ch[0]= Character.toUpperCase(ch[0]);

            for(int i=0; i<ch.length-1; i++){

                if(ch[i]==' '){

                   ch[i+1]= Character.toUpperCase(ch[i+1]);

                }

            }

            return new String(ch);
        }

}