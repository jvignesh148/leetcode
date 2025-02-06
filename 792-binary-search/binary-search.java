class Solution {
    public int search(int[] nums, int target) {
        int st=0,la=nums.length-1;
        while(st<=la){
            int m=(la+(la-st))/2;
            if(nums[m]==target) return m;
            else if(nums[m]>target) la=m-1;
            else st=m+1;
        }
        return -1;
    }
}