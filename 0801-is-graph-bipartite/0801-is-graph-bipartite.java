class Solution {
    class Edge{
        int u,v,c;
        Edge(int u, int v, int c) {
            this.u=u;
            this.v=v;
            this.c=c;
        }
    }
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, -1);
        for( int i = 0; i < graph.length; i++) {
            if(color[i] != -1) continue;
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            color[i]=0;
            while(!q.isEmpty()) {
                int num = q.poll();
                for( int v : graph[num]) {
                    if(color[v] == color[num]) return false;
                    if(color[v] == -1) {
                        color[v]=color[num]^1;
                        q.offer(v);
                    }
                }
            }   
        }
        return true;
    }
}