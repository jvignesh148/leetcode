class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = {0, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for(int num : nums) {
            int[] dup = dp.clone();
            for(int i = 0; i < 3; i++) {
                int temp = (i + num) %3;
                dup[temp] = Math.max(dup[temp], dp[i] + num);
            }
            dp = dup;
        }
        return dp[0];
    }
}