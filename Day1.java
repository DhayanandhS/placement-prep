import java.util.*;

public class Day1
{
    public static int countSubstrings(String s) 
    {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int n = s.length();
        int count = 0;
        int i = 0;
        
        while (i < n) 
        {
            if (vowels.contains(s.charAt(i))) 
            {
                int j = i;
                while (j < n && vowels.contains(s.charAt(j))) 
                {
                    j++;
                }
                int length = j - i;
                count += (length * (length + 1)) / 2;
                i = j;
            } 
            else 
            {
                i++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            
            for (int t = 0; t < T; t++) 
            {
                String S = sc.nextLine();
                System.out.println(countSubstrings(S));
            }
        }
    }
}