class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        int ans = max(nums, dp, n-1);
        return ans;
    }

    public int max(int[] nums, int[] dp, int indx) {
        if (indx < 0) {
            return 0;
        }

        if(indx == 0){
            return nums[0];
        }

        if (dp[indx] != -1) {
            return dp[indx];
        }

        int pick = nums[indx] + max(nums, dp, indx - 2);
        int notPick = max(nums, dp, indx - 1);

        return dp[indx] = Math.max(pick, notPick);
    }
}