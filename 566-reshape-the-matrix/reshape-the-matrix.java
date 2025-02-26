class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((r*c)!=(mat.length*mat[0].length)) return mat;
        int[][] arr=new int[r][c];
        int[] nums=new int[mat.length*mat[0].length];
        int ind=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                nums[ind]=mat[i][j];
                ind+=1;
            }
        }
        ind=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=nums[ind];
                ind+=1;
            }
        }
        return arr;
    }
}