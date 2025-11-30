class Solution {
    int result = 0;
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>> list =  new ArrayList<>();
        for(int i = 0; i < n; i++) list.add(new ArrayList<>());
        for(int[] arr : edges) {
            list.get(arr[0]).add(arr[1]);
            list.get(arr[1]).add(arr[0]);
        }
        dfs(list, 0, -1, values, k);
        return result;
    }
    public int dfs(List<List<Integer>> list, int num, int parent, int[] values, int k) {
        int temp = values[num];
        for(int n : list.get(num)) {
            if(n != parent) temp += dfs(list, n, num, values, k);
        }
        if(temp % k == 0) result++;
        return temp % k;
    }
}