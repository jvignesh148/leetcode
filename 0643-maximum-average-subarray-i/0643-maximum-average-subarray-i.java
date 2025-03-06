class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=Math.max(sum/k,max);
        for(int i=1;i<=nums.length-k;i++){
            sum-=nums[i-1];
            sum+=nums[i+k-1];
            max=Math.max(sum/k,max);
        }
        return max;
    }
}