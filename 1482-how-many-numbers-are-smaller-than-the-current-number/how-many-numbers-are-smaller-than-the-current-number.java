class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] n=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count+=1;
                }
            }
            n[i]=count;
        }
        return n;
    }
}