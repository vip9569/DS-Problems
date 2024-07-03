class Solution{
    public int largest(int arr[]){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
class Largest {
    public static void main(String args[]){

    Solution sc = new Solution();
    int arr[] = {2, 4, 5, 7, 3};
    System.out.println(sc.largest(arr));
    }
}
    


