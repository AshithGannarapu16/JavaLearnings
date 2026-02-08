import java.util.Arrays;

public class CoinChange {

    private int[] coins;
    private int[] dp;

    // Constructor to initialize the coin denominations and the dp array
    public CoinChange(int[] coins, int maxAmount) {
        this.coins = coins;
        Arrays.sort(this.coins); // Sort coins for optimization
        this.dp = new int[maxAmount + 1];
        Arrays.fill(this.dp, -1);
        this.dp[0] = 0; // base case: 0 coins needed for amount 0
    }

    // Function to find the minimum number of coins for change
    public int findMinCoins(int amount) {
        if (amount < 0) return -1;
        if (dp[amount] != -1) return dp[amount];

        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (amount < coin) break;
            int res = findMinCoins(amount - coin);
            if (res >= 0 && res < minCoins) minCoins = 1 + res;
        }

        dp[amount] = (minCoins == Integer.MAX_VALUE) ? -1 : minCoins;
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        int maxAmount = 100;

        CoinChange coinChanger = new CoinChange(coins, maxAmount);

        int result1 = coinChanger.findMinCoins(35);
        System.out.println("The min nos of coins required: " + result1);

        int result2 = coinChanger.findMinCoins(99);
        System.out.println("The min nos of coins required: " + result2);

        int result3 = coinChanger.findMinCoins(45);
        System.out.println("The min nos of coins required: " + result3);
    }
}
