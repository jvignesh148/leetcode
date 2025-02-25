class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        int count=0,ind=0;
        while(count<2){
            for(int i=0;i<nums.length;i++){
                ans[ind]=nums[i];
                ind+=1;
            }
            count+=1;
        }
        return ans;
    }
}