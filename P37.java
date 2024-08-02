class P37 {
    public int findDuplicate(int[] nums) {
        for(int i : nums){
            i = Math.abs(i);
                if(nums[i - 1] < 1)
                    return i;
                nums[i - 1] = nums[i - 1] * -1;
        }
        return -1;
    }
}
