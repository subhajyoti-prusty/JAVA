public class RecursionBasics {
    public static void Increasing(int n){
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        Increasing(n-1);
        System.out.print(n+" ");
    }
    public static void Decresing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        Decresing(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        Decresing(n);   
        Increasing(n);     
    }
}
