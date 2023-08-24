public class TilingProblem {
    public static int TilingProblem(int n ){ //2 x n (Floor size)
        //Base case
        if(n == 0 || n == 1){
            return 1;
        }
        //Vertical choice
        int Verticaltiles = TilingProblem(n-1);

        //Horizontal choice 
        int Horizontaltiles = TilingProblem(n-2);

        //Total ways 
        int TotalWays = Verticaltiles + Horizontaltiles;
        return TotalWays;
    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(4));        
    }
    
}
