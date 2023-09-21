package Linkedlist.src;

public class RemoveFirstLL {
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

    public int removeFirst(){
        if(size == 0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val =head.data ;
            head = tail =null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    
}
