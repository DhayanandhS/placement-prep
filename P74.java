class Solution {
    public static int largest(int[] arr) {
        // code here
        // Start by assuming the first element is the largest
        int max = arr[0]; 
        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update max if a larger element is found
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}