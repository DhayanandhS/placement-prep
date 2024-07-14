import java.util.*;
public class P15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;
        int arms = 0;
        int count = 0;
        int res = n;
        
        // Finding the number of digits
        int temp = n;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }
        
        // Calculating the Armstrong number
        temp = n;
        while(temp > 0){
            digit = temp % 10;
            arms += Math.pow(digit, count);
            temp = temp / 10;
        }
        
        // Checks if the number is an Armstrong number
        if(res == arms) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}
}