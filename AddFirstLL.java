package Linkedlist.src;
public class AddFirstLL {
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

    //adding node at first (before head)
    public void addFirst(int data){
        //Step1 = create new node 
        Node newNode = new Node(data);
        size++;
        //Check if lickedlist is empty
        if(head == null ){
            head = tail= newNode;//if linkedlist is empty   then head and tail is same as the new node 
            return;
        }
        //Step2 = newNode next = head
        newNode.next = head;
        //Step3 = head = nowNode
        head = newNode;
    }
    public static void main(String[] args) {
        AddFirstLL ll = new AddFirstLL();
        ll.addFirst(2);
        ll.addFirst(1);
    }
    
}
