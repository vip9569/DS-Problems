import java.util.ArrayList;
import java.util.*;

// This is the code to print all subsequences of an array

public class SubSequences {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        int arr[] = { 1, 2, 1 };
        int n = 3;
        int i = 0;
        int sum = 0;
        int target = 2;
        // printSubSequences(i, list, arr, n);

        System.out.println(subSequences(i, target, arr, n, sum, list));
    }

    // This is the code to print all the subsequences of an array

    // public static void printSubSequences(int i, List<Integer> list, int arr[],
    // int n){
    // if(i>=n){
    // System.out.println(list);
    // return ;
    // }
    // list.add(arr[i]);
    // printSubSequences(i+1, list, arr, n);
    // list.remove(list.size()-1);
    // printSubSequences(i+1, list, arr, n);

    // }

    // Code to print subsquences which sum is equal to target

    // public static void subSequences(int i, int target, int arr[], int n, int sum,
    // List<Integer> list) {
    // if(i==n){
    // if(target==sum){
    // System.out.println(list);
    // }
    // return;
    // }

    // list.add(arr[i]);
    // sum = sum + arr[i];
    // subSequences(i+1, target, arr, n, sum, list);

    // list.remove(list.size()-1);
    // sum -= arr[i];
    // subSequences(i+1, target, arr, n, sum, list);
    // }

    // Code to return any one of the subsequences which sum is equal to terget

    // public static boolean subSequences(int i, int target, int arr[], int n, int
    // sum, List<Integer> list) {

    // if(i==n){
    // if(target==sum){
    // System.out.println(list);
    // return true;
    // }
    // return false;
    // }

    // list.add(arr[i]);
    // sum = sum + arr[i];
    // if(subSequences(i+1, target, arr, n, sum, list) == true){
    // return true;
    // }

    // list.remove(list.size()-1);
    // sum -= arr[i];
    // if (subSequences(i+1, target, arr, n, sum, list) == true) {
    // return true;
    // }

    // return false;
    // }

    // This is the code to print the count value of all sub sequences which sun is
    // equal to target

    public static int subSequences(int i, int target, int arr[], int n, int sum, List<Integer> list) {

        if (i == n) {
            if (target == sum) {
                // System.out.println(list);       
                return 1;
            }
            return 0;
        }

        list.add(arr[i]);
        sum = sum + arr[i];
        int l = subSequences(i + 1, target, arr, n, sum, list);

        list.remove(list.size() - 1);
        sum -= arr[i];
        int r = subSequences(i + 1, target, arr, n, sum, list);

        return l+r;
    }
}
