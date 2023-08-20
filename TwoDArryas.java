import java.util.Scanner;

public class TwoDArryas {
    public static void main(String[] args) {
        int Matrix[][] = new int[4][3]; //Created a 2D Arrya
        int n = 4; // int n = Matrix.length;
        int m = 3; // int m = Matrix[0].length;
        //Input in Arrya
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        //Output in Arrya
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(Matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
