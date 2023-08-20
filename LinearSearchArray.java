package JAVA;
public class LinearSearchArray {
    public static int LinearSearch(int number[],int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]= {2,6,7,9,15,48,32,14,68};
        int key = 9;

        int index = LinearSearch(number,key);
            if(index==-1){
                System.out.println("Not Found");
            }else{
                System.out.println("Key is at the index: "+index);

            }
    }   

}
    
