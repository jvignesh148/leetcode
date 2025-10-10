class Solution {
    class Node {
        int row,col,height;
        Node(int row,int col,int height){
            this.row=row;
            this.col=col;
            this.height=height;
        }
    }
    public int trapRainWater(int[][] heightMap) {
        PriorityQueue<Node> pq=new PriorityQueue<>(Comparator.comparingInt(a->a.height));
        int water=0;
        boolean[][] visited=new boolean[heightMap.length][heightMap[0].length];
        for(int i=0;i<heightMap.length;i++){
            pq.offer(new Node(i,0,heightMap[i][0]));
            pq.offer(new Node(i,heightMap[0].length-1,heightMap[i][heightMap[0].length-1]));
            visited[i][0]=true;
            visited[i][heightMap[0].length-1]=true;
        }
        for(int i=0;i<heightMap[0].length;i++){
            pq.offer(new Node(0,i,heightMap[0][i]));
            pq.offer(new Node(heightMap.length-1,i,heightMap[heightMap.length-1][i]));
            visited[0][i]=true;
            visited[heightMap.length-1][i]=true;
        }
        int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
        while(!pq.isEmpty()){
            Node curr=pq.poll();
            for(int[] d : direction){
                int a=d[0]+curr.row;
                int b=d[1]+curr.col;
                if(a<0 || b<0 || a>=heightMap.length
                    || b>=heightMap[0].length || visited[a][b]) continue;
                visited[a][b]=true;
                water+=Math.max(0,curr.height-heightMap[a][b]);
                pq.offer(new Node(a,b,Math.max(curr.height,heightMap[a][b])));
            }
        }
        return water;
    }
}