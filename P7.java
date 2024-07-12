import java.util.Scanner;

public class P7 {
public static void main(String[] args) {

    try (Scanner Scan = new Scanner(System.in)) {
		int n=Scan.nextInt();
		int revN=0;//revN stands for reverse number.
		while(n>0){
			int lD=n%10;//ld stands for last digit.
			revN=(revN*10)+lD;//adding of the newly taken last digit to revN.
			n=n/10;
		}

		System.out.println(revN);
	}

  }

}

