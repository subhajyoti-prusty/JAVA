import java.util.Scanner;
public class Errors {
    public static void main (String args[]){
        //LOGICAL ERROR EXAMPLE
        //Write a program to find the prime numbers between 1 to 10

        System.out.println(2);
        for(int i=1;i<5;i++){
            System.out.println(2*i+1);  //Error :-  it also prints 9 which is not a prime number 
        }

        //RUNTIME ERROR EXAMPLE
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k);
        // Error:- when you assign k with 0 it will give a mathemetical error 


    }
    
}
