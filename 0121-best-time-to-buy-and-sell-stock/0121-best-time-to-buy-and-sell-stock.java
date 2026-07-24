class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minCost = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minCost) {
                minCost = price;
            }

            else if ((price - minCost) > maxProfit) {
                maxProfit = price - minCost;
            }
        }

        return maxProfit;
    }
}