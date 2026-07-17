class Solution {
    public int maximumCount(int[] nums) {
        int firstNeg = findFirst(nums, 0);
        int firstPos = findFirst(nums, 1);

        int negCount = firstNeg;
        int posCount = nums.length - firstPos;

        return Math.max(negCount, posCount);
    }

    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}