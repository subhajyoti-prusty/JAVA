package Linkedlist.src;
public class PrintLL {
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

    //Print a linkedlist
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return ;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        PrintLL ll = new PrintLL();
        ll.print();
    }
    
}
