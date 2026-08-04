class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        int first = nums[0];
        int second = nums[nums.length - 1];
        int j = 0;
        for (int i = first; i <= second; i++) {
            if (j < nums.length && nums[j] == i) {
                j++;
            } else {
                list.add(i);
            }
        }
        return list;
    }
}