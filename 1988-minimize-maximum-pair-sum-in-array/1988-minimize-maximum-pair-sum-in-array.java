class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res=0,i=0,j=nums.length-1;
        while(i<j){
            res=Math.max(nums[i]+nums[j],res);
            i++;
            j--;
        }
        return res;
    }
}