package Linkedlist.src;

public class RemoveMidLL {
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

    public void RemoveMid(int n){
        int sz = 0;
        Node temp= head;
        while (temp !=null ){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next ;
        return;
     }
}
