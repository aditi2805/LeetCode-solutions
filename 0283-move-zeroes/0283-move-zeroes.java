class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();

        for (int num : nums) {
            if (num != 0) {
                queue.offer(num);
            }
        }

        while (queue.size() < nums.length) {
            queue.offer(0);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = queue.remove();
        }
    }
}