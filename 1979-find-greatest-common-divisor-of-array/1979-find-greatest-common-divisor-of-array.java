class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int mn = nums[0];
        int max = nums[nums.length - 1];
        return gcd(mn, max);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}