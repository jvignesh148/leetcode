class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int c=0;
            while(temp!=0){
                temp/=10;
                c+=1;
            }
            if(c%2 == 0) count+=1;
        }
        return count;
    }
}