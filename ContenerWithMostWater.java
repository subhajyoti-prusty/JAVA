package ArrayList.src;
import java.util.*;
public class ContenerWithMostWater {
    //Brute force Approch           TC is Big O of N^2
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

        System.out.println(StoredWater(Height));
    }
}
