class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int d=0;
        for(int i=0;i<nums.length-1;i++){
            if(d<(nums[i+1]-nums[i])){
                d=nums[i+1]-nums[i];
            }
        }
        return d;
    }
}