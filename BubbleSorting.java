public class BubbleSorting {
    public static void Sorting(int arr[]){ //Time complexcity is big O of n^2 
        for(int Turns=0;Turns<arr.length-1;Turns++){
            for(int j=0;j<arr.length-1-Turns;j++){
                if(arr[j]>arr[j+1]){ //To check if the right element is larger or not 
                    //swapping 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void PrintBubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        Sorting(arr);
        PrintBubbleSort(arr);

    }       
}
