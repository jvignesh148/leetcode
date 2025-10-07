class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int totalProfit=0;
        int[][] nums=new int[profit.length][2];
        for(int i=0;i<profit.length;i++) {
            nums[i][0]=difficulty[i];
            nums[i][1]=profit[i];
        }
        Arrays.sort(nums,(a,b)->(a[0]-b[0]));
        for(int i=1;i<nums.length;i++){
            nums[i][1]=Math.max(nums[i][1],nums[i-1][1]);
        }
        for(int num : worker){
            totalProfit+=finder(nums,num);
        }
        return totalProfit;
    }
    public int finder(int[][] nums, int target){
        int left=0,right=nums.length-1;
        int index=0;
        while(left<=right){
            int mid=left+((right-left)>>1);
            if(nums[mid][0]<=target){
                index=nums[mid][1];
                left=mid+1;
            }
            else right=mid-1;
        }
        return index;
    }
}