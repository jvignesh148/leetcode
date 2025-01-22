class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2){
            return -1;
        }
        Arrays.sort(nums);
        int k=0,f=nums[0],l=nums[nums.length-1];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>f && nums[i]<l){
                k=nums[i];
            }
        }
        return k;
    }
}