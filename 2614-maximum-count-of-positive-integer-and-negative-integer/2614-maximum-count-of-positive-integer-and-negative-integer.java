class Solution {
    public int maximumCount(int[] nums) {
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) s1+=1;
            else if(nums[i]<0) s2+=1;
        }
        return Math.max(s1,s2);
    }
}