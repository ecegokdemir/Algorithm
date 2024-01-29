
class Knapsack { 
    
	public static void main(String args[]) 
	{ 
		int profit[] = new int[] { 60, 100, 120 }; 
		int weight[] = new int[] { 10, 20, 30 }; 
		int W = 50; 
		int n = profit.length; 
		System.out.println(knapSack(W, weight, profit, n)); 
	} 

	static int max(int a, int b) { return (a > b) ? a : b; } 

	static int knapSack(int W, int wt[], int profit[], int n) 
	{ 
		int i, w; 
		int c[][] = new int[n + 1][W + 1]; 

		for (i = 0; i <= n; i++) { 
			for (w = 0; w <= W; w++) { 
				if (i == 0 || w == 0) 
					c[i][w] = 0; 
				else if (wt[i - 1] <= w) 
					c[i][w] = max(c[i - 1][w] , profit[i - 1] + c[i - 1][w - wt[i - 1]] ); 
				else
					c[i][w] = c[i - 1][w]; 
			} 
		} 

		return c[n][W]; 
	} 

} 

