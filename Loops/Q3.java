package JAVA_QUESTIONS.Loops;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        int Sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            Sum = Sum + i;
        }
        System.out.println("The factorial of " + n + " is :" + Sum);
    }
}
