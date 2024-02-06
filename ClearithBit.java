package BitManipulation.src;

public class ClearithBit {
    public static int ClearIthBit(int n , int i ){
        int BitMask = ~(1<<i);
        return n & BitMask;
    }
    public static void main(String[] args) {
        System.out.println(ClearIthBit(10, 1));
    }
}
