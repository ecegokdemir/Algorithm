
class KnapsackRec { 

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
		if (n == 0 || W == 0) 
			return 0; 

		if (wt[n - 1] > W) 
			return knapSack(W, wt, profit, n - 1); 

		else
			return max(profit[n - 1] + knapSack(W - wt[n - 1], wt, profit, n - 1), knapSack(W, wt, profit, n - 1)); 
	} 

} 

