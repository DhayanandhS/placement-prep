import java.util.Scanner;

public class P2 {
    private static final String[] INITIALS = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] SECONDS = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static String convertDigitsUtil(int n, String str) {
        String result = "";

        if (n > 19) {
            result += SECONDS[n / 10] + (n % 10 != 0 ? " " + INITIALS[n % 10] : "");
        } else {
            result += INITIALS[n];
        }

        if (n != 0) {
            return result + (str.isEmpty() ? "" : " ") + str;
        }
        return "";
    }

    public static String handleAll(long n) {
        if (n == 0) {
            return "zero";
        }

        StringBuilder sb = new StringBuilder();

        sb.append(convertDigitsUtil((int) (n / 10000000), "crore"));
        if (sb.length() > 0) sb.append(" ");
        sb.append(convertDigitsUtil((int) ((n / 100000) % 100), "lakh"));
        if (sb.length() > 0) sb.append(" ");
        sb.append(convertDigitsUtil((int) ((n / 1000) % 100), "thousand"));
        if (sb.length() > 0) sb.append(" ");
        sb.append(convertDigitsUtil((int) ((n / 100) % 10), "hundred"));

        if (n > 100 && n % 100 != 0) {
            sb.append(" and ");
        }

        sb.append(convertDigitsUtil((int) (n % 100), ""));

        return sb.toString().trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        for (int t = 0; t < T; t++) {
            long N = sc.nextLong();
            sc.nextLine(); // Consume the newline character
            System.out.println(handleAll(N) + " ");
        }
        
        sc.close();
    }
}
