class Solution {
    // class DSU{
    //     int[] parent;
    //     DSU(int c){
    //         parent=new int[c+1];
    //         for(int i=0;i<=c;i++) parent[i]=i;
    //     }
    //     public int find(int x){
    //         if(parent[x]!=x) parent[x]=find(parent[x]);
    //         return parent[x];
    //     }
    //     public void union(int a, int b){
    //         int aroot=find(a);
    //         int broot=find(b);
    //         if(aroot!=broot) parent[aroot]=broot;
    //     }
    // }
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int[] arr : connections){
            map.putIfAbsent(arr[0],new ArrayList<>());
            map.get(arr[0]).add(arr[1]);
            map.putIfAbsent(arr[1],new ArrayList<>());
            map.get(arr[1]).add(arr[0]);
        }
        boolean[] visited = new boolean[c+1];
        int c_count=0;
        int[] connected=new int[c+1];
        for(int i=1;i<=c;i++){
            if(!visited[i]) {
                c_count++;
                dfs(map,visited,i,c_count,connected);
            }
        }
        List<TreeSet<Integer>> online=new ArrayList<>();
        for(int i=0;i<=c_count;i++) online.add(new TreeSet<>());
        for(int i=1;i<=c;i++){
            online.get(connected[i]).add(i);
        }
        boolean[] onlineStatus=new boolean[c+1];
        Arrays.fill(onlineStatus,true);
        for(int[] quer : queries){
            int st=quer[0],visit=quer[1];
            if(st==1){
                if(onlineStatus[visit]){
                    res.add(visit);
                }
                else{
                    boolean flag=false;
                    TreeSet<Integer> set = online.get(connected[visit]);
                    if(set.isEmpty()) res.add(-1);
                    else{
                        res.add(set.first());
                    }
                }
            }
            else{
                if(onlineStatus[visit]){
                    onlineStatus[visit]=false;
                    online.get(connected[visit]).remove(visit);
                }
            }
        }
        System.out.print(res);
        return res.stream().mapToInt(i -> i).toArray();
    }
    public void dfs(Map<Integer,List<Integer>> map, boolean[] visited, int m,int count, int[] min) {
        visited[m] = true;
        min[m] = count;
        if(map.get(m)!=null){
            for (int nei : map.get(m)) {
                if (!visited[nei]) {
                    dfs(map,visited,nei,count,min);
                }
            }
        }
    }
}