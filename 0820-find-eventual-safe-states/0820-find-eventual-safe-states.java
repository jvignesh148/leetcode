class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        int[] state = new int[graph.length];
        for(int i = 0; i < graph.length; i++) {
            if(dfs(graph,state,i)) list.add(i);
        }
        return list;
    }
    public boolean dfs(int[][] graph, int[] state, int n) {
        if(state[n] != 0) return state[n]==2;
        state[n] = 1;
        for(int num : graph[n]) {
            if(!dfs(graph,state,num)) return false;
        }
        state[n] = 2;
        return true;
    }
}
