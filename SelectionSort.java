public class SelectionSort {
    public static void Sort(int arr[]){ //Time complexcity is big O of n^2 
        for(int i= 0; i<arr.length-1;i++){
            int minPos = i ;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){ // Incerasing 
                    minPos = j;
                } 
            }
            //Swaping
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    public static void PrintSelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Sort(arr);
        PrintSelectionSort(arr);

        
    }
    
}
