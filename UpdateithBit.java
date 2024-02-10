package BitManipulation.src;

public class UpdateithBit {

    public static int SetIthBit(int n , int i){
        int BitMask = 1 << i ; 
        return n | BitMask;
    }

    public static int ClearIthBit(int n , int i ){
        int BitMask = ~(1<<i);
        return n & BitMask;
    }

    public static int UpdateIthBit(int n , int i, int newBit ){
        // if (newBit == 0) {
        //     return ClearIthBit(n, newBit);
        // }else{
        //     return SetIthBit(n, newBit);
        // }

        n = ClearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | newBit;
    }
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10, 2,1));
    }
}
