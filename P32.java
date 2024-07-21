class P32 {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here\
        ArrayList<Integer> a = new ArrayList<>();
        int sum = 0;
        int i = 0;

        for(int j=0;j<n;j++) {
            sum += arr[j];

            while (sum > s && i <= j) {
                sum -= arr[i];
                i++;
            }

            if (sum == s && i<=j) {
                a.add(i + 1);  // 1-based index for the start
                a.add(j + 1);  // 1-based index for the end
                return a;
            }

            
        }

        a.add(-1);  // No subarray found
        return a;
    }
}
