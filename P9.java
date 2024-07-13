import java.util.Scanner;
public class P9 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
                /*%-15s
%: This denotes the beginning of a format specifier.
-: This indicates left justification. By default, strings are right-justified, but adding a - makes them left-justified.
15: This specifies the minimum width of the field. The string will occupy at least 15 characters. If the string is shorter than 15 characters, it will be padded with spaces on the right.
s: This indicates that the argument is a string.
%03d
%: This denotes the beginning of a format specifier.
0: This specifies that the number should be padded with zeroes if it is shorter than the specified width.
3: This specifies the minimum width of the field. The integer will occupy at least 3 characters. If the integer has fewer than 3 digits, it will be padded with leading zeroes.
d: This indicates that the argument is an integer.
%n
%: This denotes the beginning of a format specifier.
n: This specifies a platform-independent newline character.
Example Explanation
Given the input:

Copy code
java 100
cpp 65
python 50
The formatted output is generated as follows:

For the first line:

String s1 = "java"
int x = 100
%-15s: The string "java" is left-justified within a 15-character wide field.
%03d: The integer 100 is printed as is since it already has three digits.
The formatted line: "java 100"
For the second line:

String s1 = "cpp"
int x = 65
%-15s: The string "cpp" is left-justified within a 15-character wide field.
%03d: The integer 65 is padded with a leading zero to become 065.
The formatted line: "cpp 065"
For the third line:

String s1 = "python"
int x = 50
%-15s: The string "python" is left-justified within a 15-character wide field.
%03d: The integer 50 is padded with a leading zero to become 050.
The formatted line: "python 050"*/
            }
            System.out.println("================================");

    }
}