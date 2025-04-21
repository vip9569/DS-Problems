import java.util.Arrays;

public class ReverseArray {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length-1;
        reverseArray2(arr, left, right);
        for(int n:arr){
            System.out.print(n);
        }
    }


    //  THis is two pointer approach to reverse array using recursion
    // static void reverseArray(int i, int arr[], int n){
    //     if(i>=n){
    //         return;
    //     }
    //     swap(arr, i, n);
    //     reverseArray(i+1, arr, n-1);
    // }
    // static void swap(int arr[], int i, int n){
    //     int temp = arr[i];
    //     arr[i] = arr[n];
    //     arr[n] = temp;
    // }


    // This is one pointer approach to reverse array using recursion
    public static void reverseArray2(int arr[], int i, int n){
        if(i>=n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i];
        arr[n-i] = temp;
        reverseArray2(arr, i+1, n);
    }
}