//TC of Big O of nlogn
//Sc of Big O of n
public class MergeSort {
    public static void printArray(int arr[]){
        for ( int i = 0; i < arr.length; ++i){
        System.out.print(arr[i] + " ");
        }
        System.out.println();
       }
        public static void MergeSort(int arr[], int si, int ei){
            if(si>=ei){
                return;
            }
            int mid = si+(ei-si)/2;  // or (SI+EI)/2
            MergeSort(arr, si, mid);
            MergeSort(arr, mid+1, ei);
            merge(arr, si, mid, ei);
    
        }
        public static void merge(int arr[], int si, int mid, int ei) {
            int[] temp = new int[ei - si + 1];
            int i=si;//Index of 1st sorted part
            int j=mid+1;//Index of 2nd sorted part
            int k=0;//Index of temp array 
            while (i<=mid && j<=ei) {
                if (arr[i] < arr[j]) {
                    temp[k]=arr[i];
                    i++;
                    } else {
                        temp[k]=arr[j];
                        j++;
                }
                k++;
            }
             //for leftover elements of 1st sorted part
            while (i<=mid) {
                temp[k++]=arr[i++];
    
            }
            //for leftover elements of 2nd sorted part
            while (j<=ei) {
                temp[k++]=arr[j++];
            }
            //copy temp to original array 
            for (i=si, k=0; k<temp.length; k++, i++) {
                arr[i]=temp[k];
            }
        }
        public static void main(String[] args) {
        int arr []  = {6,3,9,5,2,8};
        MergeSort(arr, 0, arr.length-1);
        printArray(arr);
      }
    
}
