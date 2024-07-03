
import java.util.ArrayList;
import java.util.List;
// import java.util.*;

class Solutions{
    public List<Long> jagglerSequence(long n){
        List<Long> ans = new ArrayList<>();
        while(n!=1){
        ans.add(n);
        if(n%2==1){
            n = (long)Math.pow(Math.sqrt(n), 3);
        }
        else{
            n = (long)Math.sqrt(n);
        }
        }
        ans.add(1L);
        return ans;
    }
}
public class JagglerSeq {
    public static void main(String[] args) {
        Solutions s = new Solutions();
        List<Long> abs = s.jagglerSequence(9);
        for(long i : abs){
            System.out.println(i);
        }
    }
}
