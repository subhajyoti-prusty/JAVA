package Linkedlist.src;
public class AddMiddleLL {
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
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null ){
            head = tail= newNode; 
            return;
        }
        newNode.next = head;
        head = newNode;
        }

    //Add in the middle
    public void addmiddle(int idx ,int data){
        // if i have to add in first index
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode =new Node(data);
        size++;
        Node temp = head;
        int count = 0;

        while(count<idx-1){
            temp = temp.next;
            count++;
        }
        // When my count= idx-1 then the temp is previous value
        newNode.next = temp.next;
        temp.next= newNode;
    }
    public static void main(String[] args) {
        AddMiddleLL ll = new AddMiddleLL();
        ll.addmiddle(2,5);
    }
}
