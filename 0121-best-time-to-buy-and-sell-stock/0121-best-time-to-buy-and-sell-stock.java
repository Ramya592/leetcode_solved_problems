class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int val = 0;

        for (int i = 1; i < prices.length; i++) {
            // calculate profit if selling today
            val = Math.max(val, prices[i] - min);

            // update minimum so far
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        return val;
    }
}