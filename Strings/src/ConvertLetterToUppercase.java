package Strings.src;

public class ConvertLetterToUppercase {

    public static String toUpperCase(String str) {
        StringBuilder st = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        st.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ' && i < str.length() - 1) {
                ch = Character.toUpperCase(str.charAt(i));
                st.append(ch);
            } else {
                st.append(str.charAt(i));
            }
        }

        return st.toString();
    }

    public static void main(String[] args) {
        String str = "i am subhajyoti prudty";
        System.out.print("Original string: " + str);
        System.out.println();
        System.out.print("Modified string: " + toUpperCase(str));
    }
}
