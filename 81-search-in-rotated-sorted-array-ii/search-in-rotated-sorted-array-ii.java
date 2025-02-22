class Solution {
    public boolean search(int[] nums, int target) {
        int st=0,la=nums.length-1;
        while(st<=la){
            if(nums[st]==target || nums[la]==target) return true;
            st+=1;
            la-=1;
        }
        return false;
    }
}