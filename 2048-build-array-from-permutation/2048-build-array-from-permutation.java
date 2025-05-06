class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr=new int[nums.length];
        int ind=0;
        for(int i=0;i<nums.length;i++){
            arr[ind]=nums[nums[i]];
            ind+=1;
        }
        return arr;
    }
}