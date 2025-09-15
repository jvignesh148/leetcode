class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result=new int[nums.length/3][3];
        int ind=0;
        for(int i=0;i<nums.length/3;i++){
            result[i][0]=nums[ind++];
            result[i][1]=nums[ind++];
            result[i][2]=nums[ind++];
        }
        if(!isValid(result,k)) return new int[0][0];
        return result;
    }
    public boolean isValid(int[][] nums,int k){
        for(int[] arr : nums){
            if(arr[1]-arr[0]>k || arr[2]-arr[1]>k || arr[2]-arr[0]>k) return false;
        }
        return true;
    }
}