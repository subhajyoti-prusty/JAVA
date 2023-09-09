package Linkedlist.src;
public class AddLastLL {
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

    //adding node at last (after tail)
    public void addLast(int data){
        //create new node
        Node newNode =new Node(data);//step-1
        size++;
        if(head == null ){
            head = tail= newNode;//if linkedlist is empty then head and tail is same as the new node 
            return;
        }
        tail.next = newNode; //assineing the vale of tail.next to the data a newNode
        tail = newNode;//declaring the data of newNode as tail

    }
    public static void main(String[] args) {
        AddLastLL ll = new AddLastLL();
        ll.addLast(4);
        ll.addLast(5);
    }
}
