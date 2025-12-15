class Solution {
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long result = 0;
        long count = 0;
        for(int i = 1; i < n; i++) {
            if(prices[i - 1] - prices[i] == 1) count++;
            else {
                result += (count * (count + 1)) >> 1;
                count = 0;
            }
        }
        result += (count * (count + 1)) >> 1;
        return result + n;
    }
}