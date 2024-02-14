package GreedyAlgorithm;

public class MinimunCoinAndNotes {
    public static void main(String[] args) {
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
        int n = coins.length;
        int amount = 590;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans += amount / coins[i];
            amount = amount % coins[i];
        }
        System.out.println("Minimum number of coins required = " + ans);
    }
}
