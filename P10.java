import java.io.*;
import java.util.* ;
public class P10 {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int p1 = m - 1; // Pointer for the last element in the initial part of arr1
        int p2 = n - 1; // Pointer for the last element in arr2
        int p = m + n - 1; // Pointer for the last position in arr1
        // Merge the arrays starting from the end
        while (p1 >= 0 && p2 >= 0) {
            if (arr1[p1] > arr2[p2]) {
                arr1[p] = arr1[p1];
                p1--;
            } else {
                arr1[p] = arr2[p2];
                p2--;
            }
            p--;
        }
        // Copy remaining elements of arr2, if any
        while (p2 >= 0) {
            arr1[p] = arr2[p2];
            p2--;
            p--;
        }
        return arr1;
    }
}
