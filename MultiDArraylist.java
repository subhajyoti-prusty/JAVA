package ArrayList.src;
import java.util.*;
public class MultiDArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainlist.add(list);
        
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        mainlist.add(list1);

        for (int i = 0; i < mainlist.size(); i++) {
                ArrayList<Integer>Currentlist = mainlist.get(i);
                    for (int j = 0; j < Currentlist.size(); j++) {
                        System.out.print(Currentlist.get(j)+" ");
            }
            System.out.println();
        }

        ArrayList<Integer>list01 = new ArrayList<>();
        ArrayList<Integer>list02 = new ArrayList<>();
        ArrayList<Integer>list03 = new ArrayList<>();
       
        
        for (int i = 1; i < 5; i++) {
            list01.add(i*1);
            list02.add(i*2);
            list03.add(i*3);
        }
        mainlist.add(list01);
        mainlist.add(list02);
        mainlist.add(list03);

        System.out.println(mainlist);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer>Currentlist = mainlist.get(i);
                for (int j = 0; j < Currentlist.size() ; j++) {
                    System.out.print(Currentlist.get(j)+" ");
                }
            System.out.println();
        }
    }
}