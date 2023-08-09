package JAVA_QUESTIONS.VariablesAndDataType;

//In a program, input the side of a square. You have to output the area of the square.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square in foot :");
        int x = sc.nextInt();
        int Area = x*x;
        //int Area= (a+b)*c/4;
        System.out.println("The area of the square is "+Area+"sq foot");
        

        
    }
    
}