import java.util.*;

class P46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next(); // getting string i/p

        //precompute:
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;  // this line will directly add the count to the mapped hash index
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0); // refer notes
            // fetch:
            System.out.println(hash[c - 'a']);
        }


        // this will run efficient with mapping the char in bigger sized array
        int[] hashh = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;  // this line will directly add the count to the mapped hash index
        }

        int qq;
        qq = sc.nextInt();
        while (qq-- > 0) {
            char c;
            c = sc.next().charAt(0); // refer notes
            // fetch:
            System.out.println(hashh[c]);
        }
    }
}
