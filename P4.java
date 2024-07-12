import java.util.Scanner;

public class P4 {
    public static int calculateMaximisedSum(int[] arr1, int[] arr2, int n) {
        // Dynamic Programming Arrays
        int[][] dp = new int[n][2]; // dp[i][0] -> no swap, dp[i][1] -> with swap

        // Base case
        dp[0][0] = Math.abs(arr1[0] - arr2[0]);
        dp[0][1] = Math.abs(arr1[0] - arr2[0]);

        for (int i = 1; i < n; i++) {
            int noSwap = Math.abs(arr1[i] - arr2[i]);
            int swap = Math.abs(arr1[i] - arr2[i]);

            dp[i][0] = noSwap + Math.max(dp[i - 1][0] + Math.abs(arr1[i] - arr2[i - 1]), dp[i - 1][1] + Math.abs(arr1[i] - arr1[i - 1]));
            dp[i][1] = swap + Math.max(dp[i - 1][0] + Math.abs(arr2[i] - arr2[i - 1]), dp[i - 1][1] + Math.abs(arr2[i] - arr1[i - 1]));
        }

        return Math.max(dp[n - 1][0], dp[n - 1][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Size of the arrays
            int[] arr1 = new int[N];
            int[] arr2 = new int[N];

            for (int i = 0; i < N; i++) {
                arr1[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                arr2[i] = sc.nextInt();
            }

            System.out.println(calculateMaximisedSum(arr1, arr2, N));
        }

        sc.close();
    }
}
