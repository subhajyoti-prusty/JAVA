package JAVA.OOPS;
public class OOPS_8 {
    public static void main(String[] args){
        Horse1 h = new Horse1();
        
    }
}

    class animal1 {
        animal1(){
        System.out.println("Animal Constructor is called");
           }
 }
    
    class Horse1 extends animal1 {
            Horse1(){
                super();
                System.out.println("Horse Constructor is called ");
    }
}