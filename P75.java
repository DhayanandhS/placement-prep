class Solution {
    public boolean check(int[] nums) {
        int dips = 0; // To count the number of dips
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                dips++;
            }
            // More than one dip means it's not a rotated sorted array
            if (dips > 1) {
                return false;
            }
        }
        
        // Also check the edge case where the last element wraps around to the first element
        if (dips == 1 && nums[nums.length - 1] > nums[0]) {
            return false;
        }

        return true;
    }
}
