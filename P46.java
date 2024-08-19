import java.util.Scanner;

class P46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next(); // getting string input

        // Precompute character frequencies:
        int[] hash = new int[256]; // Using size 256 to accommodate all ASCII characters
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;  // This line increments the count at the ASCII index
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0); // Get the first character of the input query
            // Fetch and print the precomputed frequency:
            System.out.println(hash[c]); // Access the corresponding ASCII index directly
        }
        
        sc.close();
    }
}

