class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                arr1.add(nums[i]);
            }
            if (i != nums.length - 1) {
                arr2.add(nums[i]);
            }
        }
        int max1 = solve(arr1);
        int max2 = solve(arr2);

        return Math.max(max1, max2);
    }

    public int solve(List<Integer> ans) {
        int n = ans.size();
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return ans.get(0);
        }

        int prev = ans.get(0);
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int pick = ans.get(i);
            if (i > 1) {
                pick += prev2;
            }
            int nonPick = prev;
            int curr = Math.max(pick, nonPick);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}