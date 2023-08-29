import java.util.Scanner;
public class SearchLargestElementInArray {
    public static boolean SearchingSmallest(int arr[][]){
        int key = Integer.MAX_VALUE;
        for(int i = 0 ; i< 3 ; i++){
            for(int j = 0 ;j< 3 ;j++ ){
                if (key > arr[i][j]) {
                    key = arr[i][j];                   
                }
            }
        }
        System.out.println("The smallest element is "+key);
        return true;
    }
    public static boolean SearchingLargest(int arr[][]){
        int key = Integer.MIN_VALUE;
        for(int i = 0 ; i< 3 ; i++){
            for(int j = 0 ;j< 3 ;j++ ){
                if (key < arr[i][j]) {
                    key = arr[i][j];                   
                }
            }
        }
        System.out.println("The largest element is "+key);
        return true;
    }
    public static void main(String[] args) {
        //Arrya Creation
        int m = 3; int n = 3;
        int arr [][] = new int[m][n];
        //Input in Array
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ;j< n ;j++ ){
                arr[i][j] = sc.nextInt();
            }
        }
        //Output in Array
        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ;j< n ;j++ ){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        SearchingLargest(arr);
        SearchingSmallest(arr);
    }
}
