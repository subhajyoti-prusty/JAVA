package ArrayList.src;
import java.util.ArrayList;
public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<Float> list3 = new ArrayList<>();

        //Add element           TC Big O of 1
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.add(1, 9); //It adds elements at the given index

        //Print Element
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        //Get Operation           TC Big O of 1
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));

        //Remove Element           TC Big O of N
        list.remove(2);
        System.out.println(list);

        //Set element at index           TC Big O of N
        list.set(2, 10);
        System.out.println(list); 

        //Contains Element           TC Big O of 1
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //Size Element --> Gives the length of the Arraylist
        System.out.println(list.size());

        //Print entire arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }    
}
