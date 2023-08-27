public class SumFirst_N_Recursive { // TC & SC is Big O of N
    public static int Sum(int n){
        if (n == 1){
            return 1;
        }
        int Sn1 = Sum(n-1); //Sn1 means sum of n-1
        int Sn = n + Sum(n-1);
        return Sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum(n));
        
    }
    
}
