class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int[] nums=new int[n*m];
        int ind=0;
        for(int sum=0;sum<=(n+m-2);sum++){
            if(sum%2!=0){
                for(int i=0;i<n;i++){
                    int j=sum-i;
                    if(j>=0 && j<m) nums[ind++]=mat[i][j];
                }
            }
            else{
                for(int i=n-1;i>=0;i--){
                    int j=sum-i;
                    if(j>=0 && j<m) nums[ind++]=mat[i][j];
                }
            }
        }
        return nums;
    }
}