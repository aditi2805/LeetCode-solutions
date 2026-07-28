class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] ans = new int[k];
        for (int i=0; i<k; i++) {
            int max = 0, maxFreq = 0;
            for(int key:map.keySet()) {
                if(map.get(key) > maxFreq){
                    maxFreq = map.get(key);
                    max = key;
                }
            }
            ans[i] = max;
            map.remove(max);
        }
        return ans;
    }
}