import java.util.ArrayList;

public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        
        ArrayList<Integer> list = new ArrayList<>();
        // Add non-zero elements to the list
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                list.add(a[i]);
            }
        }
        
        // Add zeroes to the end of the list
        while (list.size() < n) {
            list.add(0);
        }
        // Convert ArrayList to int[]
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
