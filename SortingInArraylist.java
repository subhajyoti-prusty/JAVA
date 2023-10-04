package ArrayList.src;
import java.util.ArrayList;
import java.util.Collections;
public class SortingInArraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.sort(list, Collections.reverseOrder(null));
        System.out.println(list);

        //Comparator --> It defines logics in java. eg:- Collections.reverseOrder(null)
    }
}