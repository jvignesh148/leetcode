class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max=0,count=0,c=0;
        for(int i=0;i<nums.length;i++){
            while((c&nums[i])!=0){
                c^=nums[count];
                count++;
            }
            c |= nums[i];
            max = Math.max(max, i - count + 1);
        }
        return max;
    }
}