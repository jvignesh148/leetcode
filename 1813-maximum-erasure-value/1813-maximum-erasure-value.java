class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0,maxSum=0,right=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[right]);
                sum-=nums[right];
                right++;
            }
            set.add(nums[i]);
            sum+=nums[i];
            maxSum=Math.max(sum,maxSum);
        }
        maxSum=Math.max(sum,maxSum); 
        return maxSum;
    }
}