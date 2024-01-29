public class CoffeeShopOptimization {

    public static void main(String[] args) {
        int n = 4;
        int[] prices = { 3, 2, 5, 9 };

        int result = minTotalCost(prices, n);
        int result2 = minTotalCost2(prices, n);

        System.out.println("Minimum total cost: " + result);
        System.out.println("Minimum total cost: " + result2);
    }

    // dp[i]=min (1≤j≤i)​ {prices[j-1] + dp[i-j]}
    public static int minTotalCost(int[] prices, int n) {

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            
            int minCost = Integer.MAX_VALUE;

            for (int j = 1; j <= i; j++) {

                minCost = Math.min(minCost, prices[j - 1] + dp[i - j]);
            }

            dp[i] = minCost;
        }

        return dp[n];
    }

    public static int minTotalCost2(int[] prices, int n) {

        if (n <= 0) {
            return 0;
        }

        int minCost = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {

            int cost = prices[i - 1] + minTotalCost2(prices, n - i);

            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }

    /*
        A traveler wants to walk a road of a given distance n. There is a cafe on his/her road 
        placed in every discrete location i Є {1, 2, …, n}. The traveler has to rest and have a coffee at some of 
        these cafe locations all of them having have changing coffee prices depending on the distance he has 
        walked since the last location he rested.

        The prices for all possible distances are stored in a price array. That is, price[1] denotes the price that 
        the traveler has to pay for the coffee if s/he walked a distance of 1 since the last location s/he rested, 
        price[2] denotes the price that he has to pay if s/he walked a distance of 2 since the last location s/he 
        rested and so on. For example; when n = 9, if s/he firstly rests at location 3, s/he has to pay price[3] 
        and then, if s/he rests at location 5, s/he has to pay price[2] and then, if s/he rests at location 9, s/he 
        has to pay price[4]. Hence, the total price makes “price[3] + price[2] + price[4]”.

        Your goal is to minimize the total price s/he has to pay
    */

}