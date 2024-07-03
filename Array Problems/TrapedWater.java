public class TrapedWater {


    // Time Complexity of this function is O(n) but Space Complexity is increased 
    static int trap(int arr[]){
        int res = 0;

        // This is the array which stores the left most elements of the given array
        int lb[] = new int[arr.length];

        // This is the array which stores the right most elements of passing array
        int rb[] = new int[arr.length];
        
        // This line stores the first element of the array which is always left most
        lb[0] = arr[0];

        // There is a loop which starts from index 1 to last index 
        for(int i=1;i<arr.length-1;i++){
            // This line compares given array[i] to left most arry[i-1]
            // and max between them stores in lb[i]
           lb[i] = Math.max(arr[i], lb[i-1]);
        }

        //  Same as before but it consides from right side
        rb[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
           rb[i] = Math.max(arr[i], rb[i+1]);
        }


        // This loop ignores left most element and right most element 
        //  run for 1 to 4 and ignores 0 index and 5 index
        for(int i=1; i<arr.length-1; i++){
            res = res + (Math.min(lb[i], rb[i])-arr[i]); 
        }

        return res;
    }



// Another Approach is Here 

    public static int trap2(int []arr){
        int res = 0;
        int lhb = arr[0];
        int rhb = arr[arr.length-1];
        int l = 0, r = arr.length-1;

        while(l<=r){
            if(lhb<=rhb){
                if(arr[l]>=lhb){
                    lhb = arr[l];
                }
                else{
                    res = res + lhb - arr[l];
                }
                l++;
            }
            else{
                if(arr[r]>=rhb){
                    rhb = arr[r];
                }
                else{
                    res = res + rhb - arr[r];
                }
                r--;
            }
        }
        return res;
    }



    public static void main(String []args){

        int[] heights = {4, 2, 0, 3, 2, 5};

        // Time Complexity is O(n) Space Complexity is Increased much because additional array
        System.out.println("Trapped Water : "+trap(heights));


        // Time Complexity is O(n) and Space Complexity is O(1)
        System.out.println("Trapped Water : "+trap2(heights));

    } 
}
