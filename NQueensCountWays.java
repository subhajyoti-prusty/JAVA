package Backtracking.src;
public class NQueensCountWays {
    public static boolean isSafe(char board[][], int row, int col){
        //Vertiacal up
        for(int i=row-1; i>=0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        //Digonally left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        //Digonally right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }
    public static void NQueens(char board[][],int row){
        //Base case
        if (row == board.length) {
            count++;
            return;
        }
        //column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                NQueens(board, row+1);   // Function call
                board[row][j] = 'x';    //Backtracking          
            }
        }
    }
    public static void print(char board[][]){
        System.out.println("------Chess------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        int n=5;
        char board[][] = new char[n][n];
        //initialization
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        NQueens(board, 0);
        System.out.println("The total number of ways to print the "+n+"Queens is: "+count);
    }
}
