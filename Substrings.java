package Strings.src;
public class Substrings {
    public static String substrings(String str, int stratindex, int endindex){
        String Substr = "";
        for (int i = stratindex; i < endindex; i++) {
            Substr += str.charAt(i);           
        }
        return Substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        str.substring(0, 5);        //Substring function already avalible in String class in java
        System.out.println(substrings(str, 0, 5));
    }

    
}