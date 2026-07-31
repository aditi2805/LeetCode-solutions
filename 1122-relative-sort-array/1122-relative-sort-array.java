class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int num : arr2) {

            int count = freq.get(num);
            while (count != 0) {
                arr1[index++] = num;
                count--;
            }
            freq.remove(num);
        }
        ArrayList<Integer> list = new ArrayList<>(freq.keySet());
        Collections.sort(list);
        for (int x : list) {
            int count = freq.get(x);
            while (count != 0) {
                arr1[index++] = x;
                count--;
            }
        }
        return arr1;
    }
}