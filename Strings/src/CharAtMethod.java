package Strings.src;
public class CharAtMethod {
    public static void AllLettersOfName(String Myname){
        for (int i = 0 ;i<Myname.length();++i){
            System.out.println(Myname.charAt(i));
        }
    }
    public static void main(String[] args) {
        String Myname = "Subhajyoti Prusty";
        // System.out.println(Myname.charAt(0));
        // System.out.println(Myname.charAt(1));
        // System.out.println(Myname.charAt(2));
        // System.out.println(Myname.charAt(3));
        // System.out.println(Myname.charAt(4));
        // System.out.println(Myname.charAt(5));
        // System.out.println(Myname.charAt(6));
        // System.out.println(Myname.charAt(7));
        // System.out.println(Myname.charAt(8));
        // System.out.println(Myname.charAt(9));
        // System.out.println(Myname.charAt(10));
        AllLettersOfName(Myname);
    }
    
}
