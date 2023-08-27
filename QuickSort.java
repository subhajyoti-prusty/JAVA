//TC in general is Big O of nlogn
//TC in worst case is Big O of n^2
//SC is Big O of 1 
public class QuickSort {
    public static void printArray(int arr[]){
        for ( int i = 0; i < arr.length; ++i){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei) return;
        //last element
        int pidx = partition(arr,si,ei);
        QuickSort(arr,si,pidx-1); //left
        QuickSort(arr,pidx+1,ei); //right
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1; //to make place for els smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];   //pivot = arr[i]
        arr[i] = temp;                     //temp = pivot
        return i;
    }

    public static void main(String[] args) {
        int arr []  = {6,3,9,8,2,5};
        QuickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
    
}
