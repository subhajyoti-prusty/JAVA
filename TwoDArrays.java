import java.util.Scanner;

public class TwoDArrays {
    
    public static boolean Search(int Matrix[][],int key){
        int n = 4; int m = 3;
       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(Matrix[i][j] == key){
                    System.out.println("Found the Cell at ("+i+","+j+")");
                    return true;
                }
            }
            System.out.println();
        } 
        return false;
    }
    public static void main(String[] args) {
        int Matrix[][] = new int[3][3]; //Created a 2D Array
        int n = 3; // int n = Matrix.length;
        int m = 3; // int m = Matrix[0].length;
        //Input in Array
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        //Output in Array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(Matrix[i][j] +" ");
            }
            System.out.println();
        }
        Search(Matrix, 5);
    }    
}
