// Find if any pair in a sorted & Rotated arrylist has a target sum
package ArrayList.src;
import java.util.*; 
import java.util.ArrayList;
public class PairSum2 {
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
//Better Approach - Sorting the array and then using two pointers approach to find the pairs with given sum
//TC is Big O of N
    public static boolean PairSum(ArrayList<Integer> list,int target){
        int n = list.size();
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>list.get(i+1)) { //Breaking point   
                bp=i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;

        while (lp != rp) {
            //case 1
            if (list.get(rp)+list.get(lp) == target) {
                return true;
            }
            //case 2 
            if (list.get(rp)+list.get(lp) < target) {
                lp = (lp+1) % n;
            } else {
            //case 3
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairsum(list, target));
        System.out.println(PairSum(list, target));
    }
}
