class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int low=0,high=nums.length/2;
        int result=0;
        while(low<=high){
            int mid=low+((high-low)>>1);
            if(check(nums,mid)){
                result=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return result*2;
    }
    public boolean check(int[] nums, int ind){
        for(int i=0;i<ind;i++){
            if(2*nums[i]>nums[nums.length-ind+i]){
                return false;
            }
        }
        return true;
    }
}