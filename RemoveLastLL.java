package Linkedlist.src;

public class RemoveLastLL {
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

    public int removeLast(){
        if(size == 0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val =head.data ;
            head = tail =null;
            size=0;
            return val;
        }
        // prev node will be i=size-2
        Node perv = head;
        for(int i=0;i<size - 2;i++){
            perv =perv.next;
            }
            int val =perv.next.data;
            tail.next = null;
            tail = perv;
            size--;
            return val; 
    }
    
}
