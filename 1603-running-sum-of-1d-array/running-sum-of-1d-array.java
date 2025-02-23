class Solution {
    public int[] runningSum(int[] nums) {
        int[] n=new int[nums.length];
        for(int i=0;i<n.length;i++){
            for(int j=i;j>=0;j--){
                n[i]+=nums[j];
            }
        }
        return n;
    }
}