class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int st=0;
            int la=matrix.length-1;
            while(st<=la){
                int temp=matrix[i][st];
                matrix[i][st]=matrix[i][la];
                matrix[i][la]=temp;
                st+=1;
                la-=1;
            }
        }
    }
}