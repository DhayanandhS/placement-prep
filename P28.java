import java.util.* ;
import java.io.*; 
class P28 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		int basic = sc.nextInt();

		int allow = 0;

		float hra = (20 / 100.0f) * basic;

		float da = (50 / 100.0f) * basic;
		
	    float pf = (11 / 100.0f) * basic;

		char grade = sc.next().charAt(0);

		if(grade == 'A') allow = 1700;

		else if(grade == 'B') allow = 1500;

		else allow = 1300;

		long totalSalary = Math.round(basic + hra + da + allow - pf);

		System.out.println(totalSalary);
	}
}
