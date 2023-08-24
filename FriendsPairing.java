public class FriendsPairing {
    public static int FriendsPairing(int n){
        if( n==1 || n==2){
            return n;
        }
        //Choice if Single 
        int Fn1 = FriendsPairing(n-1);//Fn1 means f(n-1)
        //Choice if Pair
        int Fn2 = FriendsPairing(n-2);//Fn2 means f(n-2)
        int PairingWays = (n-1) * Fn2;
        //Total Number of ways
        int TotalWays = Fn1 + PairingWays;
        return TotalWays;

        //OR

        //return FriendsPairing(n-1) + (n-1) * FriendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(FriendsPairing(3));        
    }
}
