package Backtracking.src;
public class FindSubsetByBacktracking {
    public static void findSubset(String str, String ans, int indx){
        if (indx == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null!");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //Yes Choice
        findSubset(str, ans+str.charAt(indx), indx+1);

        //No Choice 
        findSubset(str, ans, indx+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
    
}
