class Solution {
    static int minJumps(int[] arr, int n) {
        // your code here
        if (n<=1) return 0;
        if (arr[0] == 0) return -1;
        int step=0;
        int jump=0;
        int nextmove=0;
        
        for(int i=0;i<n;i++){
            nextmove=Math.max(nextmove,i+arr[i]);
            if(i==step){
               jump++;
                step=nextmove;
                if(step>=n-1) return jump;
            }
        }
        return -1;
    }
}
