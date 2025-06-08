public class CreatePrefixArray{


// It uses an extra array to store the prefix sum 
    public static int[] prefixCreation(int arr[]){
        int n = arr.length;
        int res[] = new int[n];
        res[0] = arr[0];
        for(int i=1; i<n; i++){
            res[i] = res[i-1]+arr[i];
        }
        return res;
    }


// Prefix Sum using the given array not extra space to solve the problem

public static int[] prefixSumInPlace(int arr[]){
    int n = arr.length;
    int res[] = new int[n];
    for(int i=1; i<n; i++){
        arr[i] = arr[i-1]+arr[i];
    }
    return arr;
}
    public static void main( String args[]){
        int arr[] = {2, 3, 6, 4, 9, 7, 5, 1};
        // int res[] = prefixCreation(arr);
        int res[] = prefixSumInPlace(arr);
        for(int n:res){
            System.out.print(n+" ");
        }
    }
}