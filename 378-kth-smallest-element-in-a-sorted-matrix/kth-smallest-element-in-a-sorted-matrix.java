class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] nums=new int[matrix.length*matrix.length];
        int ind=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                nums[ind]=matrix[i][j];
                ind++;
            }
        }
        Arrays.sort(nums);
        return nums[k-1];
    }
}