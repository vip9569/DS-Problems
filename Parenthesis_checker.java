import java.util.Stack;
// import java.util.*;
class Solution{
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> sob = new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='{' || x.charAt(i)=='[' || x.charAt(i)=='('){
                sob.push(x.charAt(i));
            }
            else if(x.charAt(i)=='}'){
                if(sob.size()==0){
                    return false;
                }
                else if(sob.peek() != '{'){
                    return false;
                }
                else{
                    sob.pop();
                }
            }
            else if(x.charAt(i)==']'){
                if(sob.size()==0){
                    return false;
                }
                else if(sob.peek() != '['){
                    return false;
                }
                else{
                    sob.pop();
                }
            }
            else if(x.charAt(i)==')'){
                if(sob.size()==0){
                    return false;
                }
                else if(sob.peek() != '('){
                    return false;
                }
                else{
                    sob.pop();
                }
            }
        }
        if(sob.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}
class Parenthesis_checker{
    public static void main(String[]args){
        String st = "{([])}";
        Solution sc = new Solution();
        if(sc.ispar(st)==true){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");

        }
    }
}