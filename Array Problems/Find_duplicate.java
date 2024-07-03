import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Find_duplicate{
    public static void main(String []args){
        int N = 5;
        int a[] = {2,3,1,2,3};
    
        Solution g = new Solution();
        ArrayList<Integer> ans = g.duplicates(a, N);
        for(Integer val : ans){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}





class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here

        ArrayList<Integer> result = new ArrayList<>();
   
    for (int i = 0; i < arr.length; i++) {
        // only need to sum twice (also prevents overflow)
        int idx = arr[i] % n;
        if (arr[idx] < 2 * n) {
            arr[idx] += n;
        }
    }
    
    for (int i = 0; i < arr.length; i++) {
       if (arr[i] >= 2*n) {
           result.add(i);
            }
        }
            if(result.size()==0){
                result.add(-1);
            } 
            return result;
        
    }
}