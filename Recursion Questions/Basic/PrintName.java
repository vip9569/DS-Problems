public class PrintName {
    public static void main(String args[]){
        printName(5);
        printTillN(1, 5);
        printNto1(10);
        print1toN(10);
    }

    public static void printName(int n){
        int i=0;
        if(i==n){
            return;
        }
        System.out.println("Vikas Yadav");
        i++;
        printName(n-1);
    }

    public static void printTillN(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        i++;
        printTillN(i, n);      //Also you can pass printTillN(i+1, n);  and comment i++
    }


    public static void printNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }




    // Print 1 to n using Backtracking***************************************

    public static void print1toN(int n){
        if(n<1){
            return ;
        }

        print1toN(n-1);
        System.out.println(n);
    }
    
}
