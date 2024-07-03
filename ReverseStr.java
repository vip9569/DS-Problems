class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char ch[] = str.toCharArray();
        String rev = "";
        for(int i=ch.length-1;i>=0;i--){
            rev += ch[i];
        }
        return rev;
    }

    public static char[] toChararray(String str){
        char arr[] = new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i);
        }
        return arr;
    }
}



public class ReverseStr {
    public static void main(String[] args) {

        String str = "vikas";
        Reverse rs = new Reverse();

        // It takes a string as input ans reverse it and then return as string  

        // System.out.println(rs.reverseWord(str));


        // It takes a string as an argument and return as an array in return type   {implementation of toCharArray()--> method manually}
        char[] arr1 = rs.toChararray(str);
        for(int j=0; j<arr1.length; j++){
            System.out.print(arr1[j]+" ");
        }
        
    }
}
