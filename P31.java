import java.util.* ;
import java.io.*; 
class P31 {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();

        int E = sc.nextInt();

        int W = sc.nextInt();

        long celcius;

        int i;

        for(i=S;i<=E;i+=W){

            celcius = (long)((i-32)/1.8);

            System.out.println(i+"\t"+celcius);

        }
	}
}