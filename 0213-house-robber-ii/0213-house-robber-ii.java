class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        return Math.max(robber(nums,0,nums.length-2),robber(nums,1,nums.length-1));
    }
    public int robber(int[] nums, int start, int end){
        int temp1=0,temp2=0;
        for(int i=start;i<=end;i++){
            int temp=temp1;
            temp1=Math.max(temp1,nums[i]+temp2);
            temp2=temp;
        }
        return temp1;
    }
}