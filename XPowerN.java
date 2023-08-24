import java.security.PublicKey;

public class XPowerN {      
    public static int Power (int x , int n){        //TC is Big O of N
        if(n == 0){
            return 1;
        }
        int Xn1 = Power(x, n-1);    //Xn1 means x(n-1)
        int Xn = x * Xn1;
        return Xn;

        //OR

        //return x * Power(x,n-1);
    }

    public static int OptimizedPower(int x , int n){  //TC is Big O of log2(N), where N=log2(X)
        if (n == 0) {
            return 1 ;  
        }
        int HalfPow = OptimizedPower(x, n/2);
        int HalfPower = HalfPow * HalfPow;

        // If n is odd
        if(n%2 != 0){
            HalfPower = x * HalfPower;
        }
        return HalfPower;
    }
    public static void main(String[] args) {
        System.out.println(Power(2, 10));
        System.out.println(OptimizedPower(2, 10));

    }
    
}
