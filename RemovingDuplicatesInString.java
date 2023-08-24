public class RemovingDuplicatesInString {
    public static void RemovingDuplicates(String String,int idx,StringBuilder NewString,boolean map[]){
        if (idx == String.length()) {
            System.out.println(NewString);
            return;            
        }
        char CurrentChar = String.charAt(idx);
        if (map[CurrentChar - 'a'] == true) {
            RemovingDuplicates(String, idx+1, NewString, map);            
        }else{
            map[CurrentChar - 'a'] = true;
            RemovingDuplicates(String, idx, NewString.append(CurrentChar), map);
        }
    }
    public static void main(String[] args) {
        String String = "aaabbkcknvabkjbdba";
        RemovingDuplicates(String, 0,new StringBuilder(""), new boolean[26]);   
    }
}
