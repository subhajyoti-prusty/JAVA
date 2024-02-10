package BitManipulation.src;

public class SetithBit {
    public static int SetIthBit(int n , int i){
        int BitMask = 1 << i ; 
        return n | BitMask;
    }
    public static void main(String[] args) {
        System.out.println(SetIthBit(10, 2));
    }
}
