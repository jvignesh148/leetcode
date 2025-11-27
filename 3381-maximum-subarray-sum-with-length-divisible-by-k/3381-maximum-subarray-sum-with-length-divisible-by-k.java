class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long result = Long.MIN_VALUE;
        long[] prefix = new long[nums.length +1];
        for(int i = 0; i < nums.length; i++) prefix[i + 1] = nums[i] + prefix[i];
        long[] best = new long[k];
        long[] worst = new long[k];
        Arrays.fill(best, Long.MIN_VALUE);
        Arrays.fill(worst, Long.MAX_VALUE);
        for(int i = 0; i <= nums.length; i++) {
            int mod = i % k;
            if(best[mod] != Long.MIN_VALUE) result = Math.max(result, prefix[i] - worst[mod]);
            best[mod] = Math.max(best[mod], prefix[i]);
            worst[mod] = Math.min(worst[mod], prefix[i]);
        }
        return result;
    }
}