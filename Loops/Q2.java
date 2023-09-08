package JAVA_QUESTIONS.Loops;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int sum = 0; int Sum = 0;
        System.out.println("Enter the numbers ");
        for (int i = 0; i <= 5; i++) {
            Scanner sc = new Scanner(System.in);
            int Numbers = sc.nextInt();
            if ((Numbers % 2 == 0)) {
                sum = sum + Numbers;
            }else{
                Sum = Sum + Numbers;
            }
        }
        System.out.println("Sum of even number is " + sum );
        System.out.println("Sum of odd Integer is "+Sum);
    }
}
