class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int len=0,maxlen=0,count=-1;
        boolean flag=false;
        while(i<nums.length){
            if(nums[i]==1) len++;
            else if(nums[i]==0 && !flag){
                count=i;
                len++;
                flag=true;
            }
            else{
                maxlen=Math.max(len,maxlen);
                i=count+1;
                len=0;
                flag=false;
                continue;
            }
            i++;
        }
        maxlen=Math.max(len,maxlen);
        return maxlen-1;
    }
}