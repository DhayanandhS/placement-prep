import java.util.Scanner;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner read = new Scanner(System.in);
        
        // Check if there's an integer available to read
        if (read.hasNextInt()) {
            int X = read.nextInt();

            if (X >= 12) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("No valid input provided.");
        }
        
        // Close the scanner
        read.close();
    }
}

