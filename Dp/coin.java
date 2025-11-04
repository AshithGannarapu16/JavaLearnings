import java.util.Arrays;

public class Coin {

    public static int countWays(int[] coins, int sum) {
        // dp[i] will store the number of ways to make amount i
        int[] dp = new int[sum + 1];

        // Base case: There is one way to make an amount of 0 (by using no coins)
        dp[0] = 1;

        // Iterate through each coin denomination
        for (int coin : coins) {
            // For each coin, iterate through amounts from the coin's value up to the target sum
            for (int i = coin; i <= sum; i++) {
                // Add the number of ways to make the remaining amount (i - coin) to dp[i]
                // This accounts for ways that include the current coin
                dp[i] += dp[i - coin];
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 5;
        int result = countWays(coins, sum);
        System.out.println("Number of ways to make change: " + result); // Output: Number of ways to make change: 5
    }
}