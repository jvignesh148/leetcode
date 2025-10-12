class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int result=0,fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==2) q.offer(new int[]{i,j});
                else if(grid[i][j]==1) fresh++;
            }
        }
        int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size=q.size();
            boolean flag=false;
            for(int i=0;i<size;i++){
                int[] arr=q.poll();
                for(int[] d : direction){
                    int row=arr[0]+d[0];
                    int col=arr[1]+d[1];
                    if(row>=0 && col>=0 && row<grid.length && col<grid[0].length && grid[row][col]==1) {
                        grid[row][col]=2;
                        q.offer(new int[]{row,col});
                        fresh--;
                        flag=true;
                    }
                }
            }
            if(flag) result++;
        }
        System.out.print(fresh+" "+result);
        return fresh==0 ? result : -1;
    }
}