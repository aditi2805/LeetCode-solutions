class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(nums[0]);
        st2.push(nums[1]);

        for (int i = 2; i < n; i++) {
            if (st1.peek() > st2.peek()) {
                st1.push(nums[i]);
            } else {
                st2.push(nums[i]);
            }
        }
        int ans[] = new int[n];
        int i = n - 1;

        while (!st2.isEmpty()) {
            ans[i--] = st2.pop();
        }

        while (!st1.isEmpty()) {
            ans[i--] = st1.pop();
        }

        return ans;
    }
}