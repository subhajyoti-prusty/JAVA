public class TryAndCatch {
    public static void main(String[] args){
        int a = 1000;
        int b = 0;

        //Without Try:
        // int c = a/b;
        // System.out.println("The result is "+c);

        //With Try
        try{
            int c =a/b;
            System.out.println("The result is "+c);
        }
        catch (Exception e) {//If the exception occurs, it will be caught here and handled by this block of code
            System.out.println("We faild to devide.");
            System.out.print("Reason:- ");
            System.out.println(e);
        }
        System.out.println("The End");
    }
    
    
}
