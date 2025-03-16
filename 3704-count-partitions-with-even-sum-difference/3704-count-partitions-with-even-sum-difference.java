class Solution {
    public int countPartitions(int[] nums) {
        int count=0,sum=0;
        int sum2=0;
        for(int num : nums) sum+=num;
        if(sum%2!=0) return 0;
        for(int i=0;i<nums.length-1;i++){
            sum2+=nums[i];
            sum-=nums[i];
            if((sum2-sum)%2== 0) count+=1;
        }
        return count;
    }
}