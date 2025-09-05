class Solution {
    public int search(int[] nums, int target) {
        int st=0,la=nums.length-1;
        int ind=0;
        boolean flag=false;
        while(st<=la){
            if(nums[st]==target){
                flag=true;
                ind=st;
                break;
            }
            if(nums[la]==target){
                flag=true;
                ind=la;
                break;
            }
            st+=1;
            la-=1;
        }
        if(!flag) return -1;
        return ind;
    }
}