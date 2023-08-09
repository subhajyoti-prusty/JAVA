package JAVA_QUESTIONS.VariablesAndDataType;

//Enter cost of 3 items from the user (using float data type) - a pencil, a pen andan eraser.
//You have to output the total cost of the items back to the user as their bill.
import java.util.Scanner;;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of pencile");
        float pencile = sc.nextFloat() ;
        System.out.println("enter the price of pen");
        float pen = sc.nextFloat()  ;
        System.out.println("enter the price of eraser");        
        float eraser = sc.nextFloat() ;
        float TotalCost = (pencile+pen+eraser);
        System.out.println("Total Cost "+TotalCost);
        float Bill = (TotalCost + ((TotalCost)/100)*18);
        System.out.println("Bill "+Bill);
    }
    
}