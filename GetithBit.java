package BitManipulation.src;

public class GetithBit {
    public static int GetIthBit(int n , int i ){
        int BitMask = 1 << i;
        if ((n & BitMask) == 0) {
            return 0;
        }else{
            return 1;
        }

    }
    public static void main(String[] args) {
        System.out.println(GetIthBit(10, 2));
        System.out.println(GetIthBit(15, 8));
        System.out.println(GetIthBit(6, 1));
    }
}
