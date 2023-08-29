package Backtracking.src;
public class PermutationByBacktracking {
    public static void Prermutation(String str, String ans) {
        //base case 
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            Prermutation(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str ="abc";
        Prermutation(str,"");
    }
}
