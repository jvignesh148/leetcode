class Solution {
    boolean flag=true;
    int ind=0;
    int[] nums;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        nums=new int[numCourses];
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++) list.add(new ArrayList<>());
        for(int[] arr : prerequisites){
            list.get(arr[0]).add(arr[1]);
        }
        boolean[] visited=new boolean[numCourses];
        boolean[] finished=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!flag) break;
            if(!finished[i]) dfs(i,list,visited,finished);
        }
        if(!flag) return new int[0];
        return nums;
    }
    public void dfs(int i, List<List<Integer>> list, boolean[] visited,boolean[] finished){
        if(!flag) return;
        if(visited[i]) {
            flag=false;
            return;
        }
        if(finished[i]) return;
        visited[i]=true;
        for(int l : list.get(i)){
            dfs(l,list,visited,finished);
        }
        visited[i]=false;
        finished[i]=true;
        nums[ind++]=i;
    }
}