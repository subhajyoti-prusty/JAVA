package JAVA_QUESTIONS.ConditionalStatement;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        System.out.print("Enter the Year: ");
        Scanner sc = new Scanner(System.in);
        int Year =sc.nextInt();
        
        if((Year % 4 == 0) && (Year % 100 == 0)||(Year % 400 == 0))
            System.out.println(Year+" is a Leap year");
        else if((Year % 4 == 0) && Year % 100 != 0)
            System.out.println(Year+" is a Leap year");
        else
            System.out.println(Year+" is not a Leap year");
    }
}
