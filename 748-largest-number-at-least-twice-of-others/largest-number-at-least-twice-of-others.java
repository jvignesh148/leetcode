class Solution {
    public int dominantIndex(int[] nums) {
        int[] n=nums.clone();
        Arrays.sort(nums);
        if(nums[nums.length-1]>=nums[nums.length-2]*2){
            for(int i=0;i<n.length;i++){
                if(nums[nums.length-1]==n[i]){
                    return i;
                }
            }
        }
        return -1;
    }
}