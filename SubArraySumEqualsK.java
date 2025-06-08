import java.util.HashMap;

public class SubArraySumEqualsK {


    // **********************It is the brute force approach to solve the question*************************
    // ************Ut takes O(N!) time to solve the problem*********************
    public static int solution(int arr[], int k){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int sum = 0;

            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum ==k){
                    count++;
                }
            }
        }
        return count;
    }

    // **********************Optimized version of the solution is given here*******************

    public static int solution1(int arr[], int k){
        int prefixSum =0;
        int count =0;
        HashMap<Integer, Integer> prefixSumPreq = new HashMap<>();

        prefixSumPreq.put(0, 1);

        for(int num: arr){
            prefixSum += num;
            if(prefixSumPreq.containsKey(prefixSum-k)){
                count += prefixSumPreq.get(prefixSum-k);
            }

            prefixSumPreq.put(prefixSum,prefixSumPreq.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
    public static void main( String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 5;
        System.out.println(solution1(arr, sum));

    }
}
