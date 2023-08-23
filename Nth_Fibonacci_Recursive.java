public class Nth_Fibonacci_Recursive {
    // SC is Big O of N 
    // TC is Big O of N^2
    // Here we started from 0 th term . we considerd 0 as the 0th term them 1 as the 1st term 
    public static int Finonacci(int n){
        if (n == 0 || n== 1) {
            return  n;
        }
        int Fn1 = Finonacci(n-1); //Fn1 means f(n-1)
        int Fn2=Finonacci(n-2);//Fn2 means F(n-2)
        int Fn = Fn1 + Fn2;
        return Fn;
    }
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(Finonacci(n));
        System.out.println(Finonacci(0));
        System.out.println(Finonacci(10));
        System.out.println(Finonacci(15));
    }   
}
