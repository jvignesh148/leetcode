class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr1=new int[nums.length/2];
        int[] arr2=new int[nums.length/2];
        int ind1=0,ind2=0,ind=0;
        for(int i : nums){
            if(i>0) arr1[ind1++]=i;
            else arr2[ind2++]=i;
        }
        for(int i=0;i<nums.length/2;i++){
            nums[ind++]=arr1[i];
            nums[ind++]=arr2[i];
        }
        return nums;
    }
}