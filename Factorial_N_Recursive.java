public class Factorial_N_Recursive {
    public static int factorial(int N){
        if (N==0) {
            return 1;
        }
        int Fn1 = factorial(N-1); //Fn1 means f(n-1)
        int Fn = N * factorial(N-1);
        return Fn;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(factorial(N));
    }
}