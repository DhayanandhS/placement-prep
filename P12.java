import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class P12{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        Collections.sort(arr);
        for(int i=0;i<n;i++){
            if(arr.get(i).equals(arr.get(i+1))){
                return arr.get(i);
            }
        }
        return -1;
    }
}
