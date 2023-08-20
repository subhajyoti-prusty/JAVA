public class PrintSubarray {
    public static void PrintSubarray(int number[]){
        int ts = 0;
        for(int i=0;i<=number.length;i++){
            for(int j=i;j<=number.length;j++){
                int sum = 0;
                for(int k=i;k<j;k++){
                    System.out.print(" "+number[k]);
                    sum = sum + number[k];
                }
                ts++;
                System.out.println();
                System.out.println("Sum of all sub-arrays :"+sum);

            }
            
        }
        System.out.println("Total Subarrays: " +ts );
    }
    public static void main (String arge[]){
        int number[] = {2,4,6,8,10};
        PrintSubarray(number);
    }
    
}
