public class InsertionSorting {
    public static void Insertionsorting(int arr[]){ // its time complexcity is Big O of n^2
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //To find the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]= arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1]= curr;
        }
    }
    public static void PrintInsertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Insertionsorting(arr);
        PrintInsertionSort(arr);      
    }
}
