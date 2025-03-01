class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int st=0,la=matrix[i].length-1;
            while(st<=la){
                if(matrix[i][st]==target || matrix[i][la]==target) return true;
                st+=1;
                la-=1;
            }
        }
        return false;
    }
}