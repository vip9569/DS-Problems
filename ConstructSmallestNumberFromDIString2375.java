public class ConstructSmallestNumberFromDIString2375 {

    public static String nextPermutation(String s) {
        // Convert the input string to a list of characters
         char[] arr = s.toCharArray();
         int n = arr.length;
         int i = n - 2;
        // Find the largest index i such that arr[i] < arr[i+1]
         while (i >= 0 && arr[i] >= arr[i+1]) {
             i--;
         }
        // If no such index exists, return "No next Permutation"
         if (i < 0) {
           String st = "No next Permutation possible";
           char[] ar = st.toCharArray();
             return ar.toString();
         }
         int j = n - 1;
       // Find the largest index j such that arr[i] < arr[j]
         while (j >= 0 && arr[j] <= arr[i]) {
             j--;
         }
        // Swap arr[i] and arr[j]
         swap(arr, i, j);
       //Reverse the sublist arr[start:end+1]
         rev(arr, i+1, n-1);
         return arr.toString();
     }
      
      // Function to swap two numbers
     private static void swap(char[] arr, int i, int j) {
         char temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }
     //Function to reverse the array
     private static void rev(char[] arr, int start, int end) {
         while (start < end) {
             swap(arr, start, end);
             start++;
             end--;
         }
     }

    //  Next Permutation end code


    public static boolean matchPattern(String num, String pattern){
        int n = pattern.length();
        for(int i=0; i<n; i++){
            if(pattern.charAt(i)=='I' && num.charAt(i)>num.charAt(i+1) || pattern.charAt(i)=='D' && num.charAt(i)<num.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    public static String solution(String pattern){
        int n = pattern.length();
        String num = "";
        for(int i=1; i<n+1; i++){
            num += (i+'0');   // this line converts integer value to character type
        }

        while (!matchPattern(num, pattern)) {
            nextPermutation(pattern);
        }

        return num;
    }
    public static void main( String args[]){
        String s = "IIIDIDDD";
        System.out.println(solution(s));
    }
}
