class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int st=-1,la=-1;
        int sum=Integer.MIN_VALUE,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>right){
                st=i;
            }
            if(nums[i]>=left) la=i;
            count+=(la-st);
        }
        return count;
    }
}