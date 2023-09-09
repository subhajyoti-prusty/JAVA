package Linkedlist;
public class HeadAndTailLL {
    //Creating a node of the linkedlist
    class Node{
        int data;
        Node next;
        //constructor for node with given value and null pointer to the next element in list.
        public Node (int data){
            this.data =data ;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        HeadAndTailLL ll = new HeadAndTailLL();
        // ll.head = new Node();
        // ll.head.next = new Node();
        
    }
}
