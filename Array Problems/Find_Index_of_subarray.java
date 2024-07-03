import java.util.ArrayList;
// import java.util.Array;
class Solutions{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> a = new ArrayList<>();
        int i=0, j=0, csum = 0;
        while(i<n && j<n){
            if(csum == s){
                a.add(j+1);
                a.add(i);
                return a;
            }
            else if(csum < s){
                csum += arr[i];
                System.out.println("It is less condition"+csum);
                i++;
            }
            else{
                csum -= arr[j];
                System.out.println("It is greater condition"+csum);
                j++;
            }
        }
        return a;
    }
}
public class Find_Index_of_subarray {
    public static void main(String[] args) {
        Solutions sb = new Solutions();

        int N = 5, S = 12;
        int A[] = {1,2,3,7,5};
        System.out.println(sb.subarraySum(A, N, S));
    }
    
}
