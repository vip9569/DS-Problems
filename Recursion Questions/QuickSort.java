public class QuickSort {
    public static void main(String args[]){
        int arr[] = {3, 5, 6, 2, 1, 5, 9, 4};
        int low = 0;
        int high = arr.length-1;

        qs(arr, low , high);

        for(int p:arr){
            System.out.print(p);
        }

    }
    public static void qs(int arr[], int low, int high){
        if (low<high) {
            int pindx = findpindx(arr, low, high);

            qs(arr, low, pindx-1);
            qs(arr, pindx+1, high);
        }
    }

    public static int findpindx(int arr[], int low, int high){
        int pivot = arr[low];
        int i =low;
        int j = high;
        while (i<j) {
            while (arr[i]<=pivot && i<=high-1) {
                i++;
            }
            while (arr[j]>pivot && j>=low+1) {
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp2 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp2;
        return j;
    }
}
