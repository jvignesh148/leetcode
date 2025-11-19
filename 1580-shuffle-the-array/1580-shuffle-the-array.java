class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int ind=0,st=0;
        int la=nums.length/2;
        while(st<nums.length/2 && la<nums.length){
            arr[ind]=nums[st];
            arr[ind+1]=nums[la];
            st+=1;
            la+=1;
            ind+=2;
        }
        return arr;
    }
}