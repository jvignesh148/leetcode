class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int duplicate = -1, missing = -1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]) duplicate = nums[i];
            if(nums[i] > (nums[i-1] + 1)) missing = nums[i - 1] + 1;
        }
        if(missing == -1 && nums[0] != 1) missing = 1;
        if( missing == -1 ) missing = nums[nums.length - 1] + 1; 
        return new int[]{duplicate, missing};
    }
}