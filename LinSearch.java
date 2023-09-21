package Linkedlist.src;

public class LinSearch {
    class Node{
        int data;
        Node next;
        public Node (int data){
            this.data =data ;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public int LinSearch(int key){ 
        Node temp = head;
        int i =0;
        while(temp!= null){
            if(key==temp.data){
                return i;
            }
            temp =temp.next;
            i++;
        }
        return -1;
    }
}
