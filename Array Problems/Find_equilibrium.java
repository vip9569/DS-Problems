
import java.util.*;
class Solution{
    public static int equilibrium(int arr[], int n){
        int sr = 0;
        int sl = 0;
        if(n==1){
            return 1;
        }
        
        for(int i=1; i<n; i++){
            sr += arr[i];
        }
        
        for(int i=0; i<n-1; i++){
            if(sl == sr){
                return i+1;
            }
            sl += arr[i];
            sr -= arr[i+1];
        }
        return -1; 
    }

}
class Find_equilibrium{
    public static void main(String[]args){
       int n = 5; 
    int arr[] = {1,3,5,2,2};
    Solution s = new Solution();
    System.out.println("Index : "+s.equilibrium(arr, n));
    
    }
}