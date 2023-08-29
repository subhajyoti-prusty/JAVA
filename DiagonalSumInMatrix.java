public class DiagonalSumInMatrix {
//In this question the digonal from Left-top to Bottom-Right is called Primary Digonal
//In this question the digonal from Right-top to Bottom-left is called Secondary Digona
    public static int DigonalSum(int Matrix[][]){ 
        int sum = 0;
        //This method is having a TC of Big O of N^2
        // for (int i=0;i<Matrix.length;i++){ 
        //     for(int j=0;j<Matrix.length;j++){
        //         if(i == j){
        //             sum += Matrix[i][j];
        //         }else if(i+j == Matrix.length-1){
        //             sum += Matrix[i][j];
        //         }
        //     }
        // }

        //Optimised Way with a TC of Big O of N
        for (int i = 0; i < Matrix.length; i++) {
            //Primary Digonal
            sum += Matrix[i][i];
            //Secondary Digonal
            if (i != Matrix.length-1-i)
                sum += Matrix[i][Matrix.length - 1 - i];     
        }
        return sum;
    }
    public static void main(String[] args) {
        int Matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}}; 
    System.out.println("The Sum of Primary Digonal in Matrix is: " + DigonalSum(Matrix));
    }
    
}
