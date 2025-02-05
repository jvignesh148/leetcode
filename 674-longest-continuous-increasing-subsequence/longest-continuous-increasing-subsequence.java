class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int m=0;
        int temp=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                temp+=1;
            }
            else{
                m=Math.max(temp,m);
                temp=1;
            }
        }
        m=Math.max(temp,m);
        return m;
    }
}