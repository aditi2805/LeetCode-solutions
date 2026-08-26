class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        
        return solve(n, cost, dp);
    }

    public int solve(int i, int[] cost, int[] dp) {
        if (i == 0) {
            return cost[0];
        }
        if (i == 1) {
            return cost[1];
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        if (i == cost.length) {
            return dp[i] = Math.min(solve(i - 1, cost, dp), solve(i - 2, cost, dp));
        }

        return dp[i] = cost[i] + Math.min(solve(i - 1, cost, dp), solve(i - 2, cost, dp));
    }
}