package ArrayList.src;
import java.util.ArrayList;
public class MaxInArraylist {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;

        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        for (int i = 0; i < list.size(); i++) {
            // if (max < list.get(i)) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max Element = " + max);
    }
}
