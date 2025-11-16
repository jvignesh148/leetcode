class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        int[][] result = new int[k][k];
        int[] row = topoSort(k,rowConditions);
        int[] col = topoSort(k,colConditions);
        if(row == null || col == null) return new int[0][0];
        for(int i=0;i<k;i++) {
            int j = finder(row[i],col);
            if(j == -1) return new int[0][0];
            result[i][j] = row[i];
        }
        return result;
    }
    public int finder(int num, int[] nums) {
        for(int i = 0; i < nums.length; i++) if(nums[i] == num) return i;
        return -1;
    }
    public int[] topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }
        int[] indeg = new int[V+1];
        for(int[] arr : edges) {
            adj.get(arr[0]).add(arr[1]);
            indeg[arr[1]]++;
        }
        ArrayDeque<Integer> adq= new ArrayDeque<>();
        int[] nums = new int[V];
        for(int i = 1; i <= V; i++) if(indeg[i]==0) adq.add(i);
        int index = 0;
        while(!adq.isEmpty()) {
            int num = adq.poll();
            nums[index++] = num;
            for(int n : adj.get(num)){
                if(--indeg[n] == 0 ) adq.add(n);
            }
        }
        if(index != V) return null;
        return nums;
    }
}