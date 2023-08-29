package Strings.src;
import java.util.Scanner;
public class StringsBasic {
    public static void main(String[] args) {

        // STRINGS ARE IMMUTABLE

        String str = "abcd";
        String str1 = new String("abcd");

        //Input and Output in a String 
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);

        //String.length to find the length of the given string 
        String Myname = "Subhajyoti Prusty";
        System.out.println(Myname.length());   //here length is a function 


    }
    
}
