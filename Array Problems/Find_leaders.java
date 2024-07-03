import java.util.ArrayList;
public class Find_leaders{
    public static void main(String[] args){
        int[] arr = {8, 11, 5, 11, 7, 6, 3};
        ArrayList<Integer> res = new ArrayList<>();
        // for(int i = 0; i<arr.length; i++){
        //     boolean isleader = true;
        //     for(int j = i+1; j<arr.length; i++){
        //         if(arr[j]>arr[i]){
        //             isleader = false;
        //             break;
        //         }
        //     }
        //     if(isleader==true){
        //         System.out.print(arr[i]);
        //     }
        // }
        // return res;





        int max = arr[n-1];
        res.add(arr[n-1]);
        for(int i = n-2; i>=0; i--){
            if(arr[i]>=max){
                max = arr[i];
                res.add(arr[i]);
            }

        }
        Collections.reverse(res);
        return res;
    }
}