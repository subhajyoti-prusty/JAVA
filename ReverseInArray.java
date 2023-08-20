public class ReverseInArray {
    public static void reverse(int number[]){
        int start=0;
        int end=number.length-1;
        while (start<end) {
            //swap the elements
            int temp =  number[end];
            number[end] = number[start];
            number[start]=temp ;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int number[] = {2,4,6,8};
        //System.out.println("Original Array: ");
        //System.out.println(number[]);
        reverse(number);
        System.out.println("reversed Array: ");
        for(int i=0;i<number.length;i++ ){
        System.out.print(number[i]+" ");
        }
        System.out.println();

    }    
}
