import java.util.Scanner;

//   It is the brute force approch to solve this problem it takes O(n2) time complexity in worst case
class Solution{
    private int nums[];

    Solution(int num[]){
        this.nums = nums;
    }

    public int sumRange(int left, int right){
        int sum =0;
         for(int i=left; i<=right; i++){
            sum += nums[i];
         }
         return sum;
    }
}

// ***********It is the Inhanced version of this problem it takes O(n) time to solve the problem using prefix sum****

class Solution{

    int prefixSum[];
    public Solution(int  nums[]){
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];

        }
        this.prefixSum = nums;
    }
    public int rangeSum(int left, int right){
        return prefixSum[right]-prefixSum[left];

    } 
}

public class RangeSumQueryImmutable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Solution sol;
        String query[] = {"Solution", "sumRange", "sumRange", "sumRange"};
        int arr[];

        for(String s:query){
            if(s.equals("Solution")){
                System.out.print("Enter Size of array : ");
                int n = sc.nextInt();
                arr = new int[n];
                System.out.println("Enter Array Elements : ");
                for(int j=0; j<n; j++){
                    arr[j] = sc.nextInt();

                }
                sol = new Solution(arr);
            }
            if(s.equals("sumRange")){
                System.out.println("Enter Range to calculate sum : ");
                int left = sc.nextInt();
                int right = sc.nextInt();
                System.out.println("Range Sum : "+sol.sumRange(left, right));
            }
        }


    }
}
