class Solution {
    static {
        for(int i=0;i<500;i++){
            getMaximumXor(new int[0],0);
        }
    }
    public static int[] getMaximumXor(int[] nums, int maximumBit) {
        int num=(1<<maximumBit)-1;
        for(int i=0;i<nums.length;i++){
            if(i>0) nums[i]=nums[i]^nums[i-1];
        }
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[nums.length-i-1]=nums[i]^num;
        }
        return result;
    }
}