class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] nums=new int[m][n];
        for(int[] arr : guards) nums[arr[0]][arr[1]]=2;
        for(int[] arr : walls) nums[arr[0]][arr[1]]=-1;
        for(int[] arr : guards) dfs(nums,arr[0],arr[1]);
        int count=0;
        for(int[] arr : nums){
            for(int i=0;i<arr.length;i++) {
                if(arr[i]==0) count++;
            }
        }
        return count;
    }
    public void dfs(int[][] arr, int n, int m){
        for(int i=n-1;i>=0;i--) {
            if(arr[i][m]==2 || arr[i][m]==-1) break;
            if(arr[i][m]==0) arr[i][m]=1;
        }
        for(int i=n+1;i<arr.length;i++) {
            if(arr[i][m]==2 || arr[i][m]==-1) break;
            if(arr[i][m]==0) arr[i][m]=1;
        }
        for(int i=m-1;i>=0;i--) {
            if(arr[n][i]==2 || arr[n][i]==-1) break;
            if(arr[n][i]==0) arr[n][i]=1;
        }
        for(int i=m+1;i<arr[0].length;i++) {
            if(arr[n][i]==2 || arr[n][i]==-1) break;
            if(arr[n][i]==0) arr[n][i]=1;
        }
    }
}