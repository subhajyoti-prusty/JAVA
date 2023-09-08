package JAVA_QUESTIONS.Loops;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int Table = n * i;
            System.out.println(n+" X "+i+" = "+Table);
        }
    }
}
