package BitManipulation.src;

public class FastExponentiation {
    public static int  power(int x, int n)  {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
            ans = ans * x;
            }
            x = x * x;
            n = n >> 1;  
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(5, 3));
    }
}
