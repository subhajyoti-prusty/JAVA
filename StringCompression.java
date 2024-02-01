package Strings.src;

public class StringCompression {
    public static String Compress(String str){
        StringBuilder st = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            st.append(str.charAt(i));
            if (count>1) {
                st.append(count.toString());
            }
        }
        String  res = st.toString();
        return res;
    }
    public static void main(String[] args) {
        String str = "aaabbbssscccw";
        System.out.println("Given string : "+str);
        System.out.println();
        System.out.print("Compressed string : "+ Compress(str));

    }
}
