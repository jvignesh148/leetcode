class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0) return 0;
        int tillmax=nums[0];
        int max=nums[0],min=nums[0];
        for(int i=1;i<nums.length;i++){
            int num = nums[i];
            if(num<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(num,max*num);
            min=Math.min(num,min*num);
            tillmax=Math.max(max,tillmax);
        }
        return tillmax;
    }
}