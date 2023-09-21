package Linkedlist.src;

public class RecSearchLL {
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

    public int helper(Node head,int key){
        if (head ==null){
            return -1 ;//element not found
        }
        if (head.data == key ){
                return 0;//found at first node
            }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
         }
         return idx+1;
    }
    public int RecSearch(int key){
        return helper(head,key); //the work of recursive search is done in the helper class
    }
    
}
