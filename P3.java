import java.util.*;

public class P3 {
    public static int maxPerimeterTriangle(ArrayList<Integer> arr, int n) {
        // Sort the array in non-decreasing order
        Collections.sort(arr);
        
        // Traverse from the end to the beginning
        for (int i = n - 1; i >= 2; i--) {
            int a = arr.get(i - 2);
            int b = arr.get(i - 1);
            int c = arr.get(i);
            
            // Check if a, b, c can form a triangle
            if (a + b > c) {
                return a + b + c;
            }
        }
        
        // If no valid triangle is found, return 0
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            // Read the size of the array
            int n = scanner.nextInt();
            
            // Read the array
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }
            
            // Find and print the maximum perimeter of a triangle
            System.out.println(maxPerimeterTriangle(arr, n));
        }
        
        scanner.close();
    }
}
