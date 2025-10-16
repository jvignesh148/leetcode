class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] arr=new int[]{-1,-1};
        int left=0,right=0;
        for(int i=indexDifference;i<nums.length;i++){
            int j=i-indexDifference;
            if(nums[j]<nums[left]) left=j;
            if(nums[j]>nums[right]) right=j;
            if(Math.abs(nums[i]-nums[left])>=valueDifference){
                return new int[]{left,i};
            }
            if(Math.abs(nums[i]-nums[right])>=valueDifference){
                return new int[]{right,i};
            }
        }
        return arr;
    }
}