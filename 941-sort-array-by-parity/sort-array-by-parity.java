class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int st=0,la=nums.length-1;
        while(st<=la){
            if(nums[st]%2==0) st+=1;
            else if(nums[la]%2!=0) la-=1;
            else {
                int temp=nums[st];
                nums[st]=nums[la];
                nums[la]=temp;
                st+=1;
                la-=1;
            }
        }
        return nums;
    }
}