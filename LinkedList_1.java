public class LinkedList_1{

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

    //Methods for linkedlist

    //adding node at first (before head)
    public void addFirst(int data){
        //Step1 = create new node 
        Node newNode = new Node(data);
        size++;
        //Check if lickedlist is empty
        if(head == null ){
            head = tail= newNode;//if linkedlist is empty then head and tail is same as the new node 
            return;
        }
        //Step2 = newNode next = head
        newNode.next = head;
        //Step3 = head = nowNode
        head = newNode;
        }

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

    public int LinSearch(int key){ 
        Node temp = head;
        int i =0;
        while(temp!= null){
            if(key==temp.data){
                return i;
            }
            temp =temp.next;
            i++;
        }
        return -1;
    }
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

    //Reverse of ll
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
     // Remove from mid 
     public void RemoveMid(int n){
        //calculate size
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
        //sz-n
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


    public static void main(String[] args) {
        LinkedList_1 ll = new LinkedList_1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addmiddle(2,3);
        ll.print();
        //System.out.println(ll.size);
        //ll.removeFirst();
        //ll.print();
        //System.out.println(ll.size);
        //ll.removeLast();
        //ll.print();
        //System.out.println(ll.size);
        //System.out.println("Index of element is "+ll.LinSearch(3));
        //System.out.println("Index of element is "+ll.LinSearch(6));
        //System.out.println("Index of element is "+ll.RecSearch(3));
        //System.out.println("Index of element is "+ll.RecSearch(6));
        //ll.reverseList();
        //ll.print();
        ll.RemoveMid(2);
        ll.print();        
    }
} 