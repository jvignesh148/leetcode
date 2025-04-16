class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int max=0,count=1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1) count++;
                else{
                    max=Math.max(max,count);
                    count=1;
                }
            }
        }
        max=Math.max(max,count);
        return max;
    }
}