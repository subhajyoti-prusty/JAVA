public class BinaryStringWithoutConsecutiveOnes {
    public static void BinaryString(int n, int LastPlace, String String){
        //Base case 
        if(n == 0){
            System.out.println(String);
            return;
        }
        //Recursion
        BinaryString(n-1, 0, String+"0");
        if(LastPlace == 0 ){
            BinaryString(n-1,1, String+"1");
        }
    }
    public static void main(String[] args) {
        BinaryString(3,0, "");        
    }
    
}
