import java.util.Arrays;
public class Find_missing{
    public static void main(String []args){
        int n =5;
        int[] arr = {1, 2, 3, 5};
        int total_sum = (n*(n+1))/2;
        int array_sum = 0;
        System.out.println("Array Length is : "+arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");

            array_sum = array_sum + arr[i];
        }
            System.out.println(" ");
        int missing_num = total_sum - array_sum;
        System.out.println("Missing Number is : "+missing_num);
    }
}