public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j <= n-2; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}