class Solution {
    public int swimInWater(int[][] grid) {
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        boolean[][] visited=new boolean[grid.length][grid.length];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{grid[0][0],0,0});
        visited[0][0]=true;
        int result=0;
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            result=Math.max(result,curr[0]);
            if(curr[1]==grid.length-1 && curr[2]==grid.length-1) return result;
            for(int[] dir : directions){
                int x=curr[1]+dir[0],y=curr[2]+dir[1];
                if(x>=0 && y>=0 && x<grid.length && y<grid.length && !visited[x][y]){
                    visited[x][y]=true;
                    pq.offer(new int[]{grid[x][y],x,y});
                }
            }
        }
        return result;
    }
}