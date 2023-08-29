public class SprialMatrix {
    public static void SprialMatrix(int Matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = Matrix.length - 1;
        int endCol = Matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){
            //Top Boundary 
            for(int j=startCol; j<= endCol; j++){       // j is used for Coloum
                System.out.print(Matrix[startRow][j]+" ");
            }
            //Right Boundary
            for (int i = startRow + 1; i <= endRow; i++) {       // i is used for Rows
                System.out.print(Matrix[i][endCol]+" ");
            }
            //Bottom Boundary
            if(startRow != endRow) {  // This if statement is written because if there is a  mXn matrix then it will prevent the single center cell to be printer twice
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(Matrix[endRow][j]+" ");
                }
            }
            //Left Boundary
            if(startCol != endCol) {    // This if statement is written because if there is a  mXn matrix then it will prevent the single center cell to be printer twice
                for(int i=endRow-1; i>=startRow+1; i--){
                    System.out.print(Matrix[i][startCol]+" ");
                }
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int Matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        SprialMatrix(Matrix);
    }
}