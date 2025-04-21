public class Rescursion1 {
    public static int count = 0;
    // public int global count = 0;

    public static void main(String[] args) {
            func();
    }

    public static void func(){
     
        if(count == 3){
            return;
        }
        System.out.println("hello");
        count ++;
        func();
    }
}