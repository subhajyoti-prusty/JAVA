package Strings.src;
import java.util.Scanner;
public class Palindrome {
    public static boolean IsPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(IsPalindrome(str));
    }
    
}
