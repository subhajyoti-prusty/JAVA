// Find if any pair in a sorted arrylist has target sum
package ArrayList.src;
import java.util.*;
import java.util.ArrayList;
public class PairSum1 {
//Brute Force       TC is Big O of N^2
    public static boolean pairsum(ArrayList<Integer> list,int target){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)+list.get(j) == target){
                return true;
            }
            
        }
    }
    return false;
}

//Optimized ways        TC is Big O of N
    public static boolean PairSum(ArrayList<Integer> list,int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp<=rp){
            //case 1
            if (list.get(rp)+list.get(lp) == target) {
                return true;
            }
            //case 2 
            if (list.get(rp)+list.get(lp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(pairsum(list, target));
        System.out.println(PairSum(list, target));

    }    
}
