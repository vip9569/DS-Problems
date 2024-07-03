class Solution{
    public int secondLargest(int arr[]){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }

        }
        int secondlargest = arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j]>secondlargest && arr[j] != largest){
                secondlargest = arr[j];
            }
        }
        return secondlargest;
    }
}

class SecondLargest{
    public static void main(String[] args) {
        Solution sc = new Solution();
        int arr[] = {4, 5, 3, 6, 7, 9};
        System.out.println(sc.secondLargest(arr));
    }
}