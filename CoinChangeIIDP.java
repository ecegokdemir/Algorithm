import java.util.*;
 

public class CoinChangeIIDP {

      public static void main(String[] args) {

        List<Integer> coins = Arrays.asList(1, 2, 3);

        int n = 3;

        int sum = 4;

        System.out.println(count(coins, n, sum));

    }

    static int count(List<Integer> coins, int n, int sum) {

        int[][] dp = new int[n + 1][sum + 1];
 
        //dp[i][j] = dp[i - 1][j] + dp[i][j - coins.get(i - 1)];

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) { //satır

            for (int j = 0; j <= sum; j++) { // sütun

                dp[i][j] += dp[i - 1][j];
 
                if ((j - coins.get(i - 1)) >= 0) {

                    dp[i][j] += dp[i][j - coins.get(i - 1)];

                }

            }

        }

        return dp[n][sum];

    }
}
