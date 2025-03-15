class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int temp=sum;
        for(int i=0;i<left.length;i++){
            left[i]=sum-nums[i];
            sum-=nums[i];
        }
        for(int i=right.length-1;i>=0;i--){
            right[i]=temp-nums[i];
            temp-=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(left[i]-right[i]);
        }
        return nums;
    }
}