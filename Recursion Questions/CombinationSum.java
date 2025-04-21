import java.util.*;
public class CombinationSum {
    public static void main(String args[]){
        int arr[] = {6, 3, 1, 3};
        int target = 7;
        int i  =0;
        // int n = arr.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        combinationSum(arr, target, i, list, ans);
        System.out.println(ans);
    } 

    public static void combinationSum(int[] arr, int target, int i, List<Integer> list, ArrayList<ArrayList<Integer>> ans){
            if(i==arr.length){
                if (target==0) {
                    
                    ans.add(new ArrayList<>(list));
                }
                return;
            }
            if(arr[i]<=target){
            list.add(arr[i]);
            // target-=arr[i];
            combinationSum(arr, target-arr[i], i, list, ans);
            list.remove(list.size()-1);
            }

            // target+=arr[i];
            combinationSum(arr, target, i+1, list, ans);
        
    }
    
}
