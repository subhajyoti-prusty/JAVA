package ArrayList.src;
import java.util.*;
public class ContenerWithMostWater {

    // 2 Pointer Approch            TC is Big O of N
    public static int storedwater(ArrayList<Integer>Height){
        int maxwater=0;
        int lp = 0;
        int rp = Height.size()-1;

        while(lp < rp){
            //Calculate area of water
            int ht = Math.min(Height.get(lp),Height.get(rp));
                int width = rp - lp;
                int currentwater = ht * width;
                maxwater = Math.max(maxwater,currentwater);
            //Update Pointer
            if (Height.get(lp) < Height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
    }
    // Brute force Approch           TC is Big O of N^2
    public static int StoredWater(ArrayList<Integer>Height){
        int MaxWater = 0;
        for (int i = 0; i < Height.size(); i++) {
            for (int j = i+1; j < Height.size() ; j++) {
                int ht = Math.min(Height.get(i),Height.get(j));
                int width = j-i;
                int CurrentWater = ht * width;
                MaxWater = Math.max(MaxWater,CurrentWater);
            }
        }
        return MaxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>Height = new ArrayList<>();
        //1, 8, 6, 2, 5, 4, 8, 3, 7
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        System.out.println("Solution With Brute Force Approch: "+StoredWater(Height));
        System.out.println("Solution With 2 Pointer Approch: "+storedwater(Height));
    }
}
