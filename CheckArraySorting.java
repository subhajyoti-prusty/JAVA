public class CheckArraySorting { // TC and SC Big O of N s
    public static boolean isSorted(int array[],int i){
        if (i == array.length-1){
            return true; //sorted
        }
        if (array[i] > array[i+1]) {
            return false;
        }
        return isSorted(array, i+1);
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        int array1[] ={2,3,1,6,8,7};
        System.out.println(isSorted(array, 0));
        System.out.println(isSorted(array1, 0));     
    } 
}