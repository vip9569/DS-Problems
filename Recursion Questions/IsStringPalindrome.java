public class IsStringPalindrome {
    public static void main(String args[]){
        String str = "MADOM";
        int i = 0;
        int n = str.length();
        // System.out.println(isPalindrome(str, i, n));
        System.out.println(isPalindrome(str, i, n));

    }
    

    public static boolean isPalindrome(String str, int i, int n){

        
        if (i>=n/2) {
            return true;
        }
        if (str.charAt(i)!=str.charAt(n-i-1)) {
            return false;
        }
        return isPalindrome(str, i+1, n);
    }
}
