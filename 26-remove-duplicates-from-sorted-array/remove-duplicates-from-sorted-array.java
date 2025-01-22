class Solution {
    public int removeDuplicates(int[] nums) {
        //int[] arr=new int[nums.length];
        int ind=1;
        for(int i=0;i<nums.length;i++){
            if(nums[ind-1]!=nums[i]){
                nums[ind]=nums[i];
                ind++;
            }
        }
        return ind;
    }
}