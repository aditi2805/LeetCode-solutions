class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int prev1 = nums[0];
        int prev = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            int curr = Math.max(prev, nums[i] + prev1);
            prev1 = prev;
            prev = curr;
        }
        return prev;
    }
}