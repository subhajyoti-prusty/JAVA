package Linkedlist.src;

public class ReverseListLL {
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

    public void reverseList(){
        Node prev= null;
        Node current = tail = head;
        Node next;
        while(current!= null){
            next = current.next;
            current.next =prev;
            prev = current;
            current = next;
        }
        head = prev;
     }
    
}
