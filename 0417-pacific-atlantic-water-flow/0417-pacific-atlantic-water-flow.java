class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] visited=new boolean[heights.length][heights[0].length];
        boolean[][] visited2=new boolean[heights.length][heights[0].length];
        for(int i=0;i<heights.length;i++){
            dfs(heights,i,0,Integer.MIN_VALUE,visited);
            dfs(heights,i,heights[0].length-1,Integer.MIN_VALUE,visited2);
        }
        for(int i=0;i<heights[0].length;i++){
            dfs(heights,0,i,Integer.MIN_VALUE,visited);
            dfs(heights,heights.length-1,i,Integer.MIN_VALUE,visited2);
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[0].length;j++){
                if(visited[i][j] && visited2[i][j]) list.add(Arrays.asList(i,j));
            }
        }
        return list;
    }
    public void dfs(int[][] heights, int row, int col, int num, boolean[][] visited){
        if(row<0 || col<0 || row>=heights.length ||
                col>=heights[0].length || visited[row][col] || heights[row][col]<num) return;
        visited[row][col]=true;
        dfs(heights,row+1,col,heights[row][col],visited);
        dfs(heights,row-1,col,heights[row][col],visited);
        dfs(heights,row,col+1,heights[row][col],visited);
        dfs(heights,row,col-1,heights[row][col],visited);
    }
}