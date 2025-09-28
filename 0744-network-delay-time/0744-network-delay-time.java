class Solution {
    class Node{
        int src,dest,weight;
        Node(int src,int dest,int weight){
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        int time=0;
        PriorityQueue<Node> pq=new PriorityQueue<>(Comparator.comparingInt(a->a.weight));
        List<List<int[]>> list=new ArrayList<>();
        for(int i=0;i<=n;i++) list.add(new ArrayList<>());
        for(int[] arr : times){
            list.get(arr[0]).add(new int[]{arr[1],arr[2]});
        }
        int[] distance=new int[n+1];
        boolean[] visited=new boolean[n+1];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[k]=0;
        pq.offer(new Node(k,-1,0));
        while(!pq.isEmpty()){
            Node curr=pq.poll();
            if(visited[curr.src]) continue;
            visited[curr.src]=true;
            for(int[] arr : list.get(curr.src)){
                if(distance[curr.src] + arr[1] < distance[arr[0]]){
                    int newdistance=arr[1]+distance[curr.src];
                    distance[arr[0]]=newdistance;
                    pq.offer(new Node(arr[0],curr.src,distance[arr[0]]));
                }
            }
        }
        for(int i=1;i<n+1;i++){
            if(distance[i]==Integer.MAX_VALUE) return -1;
            time=Math.max(time,distance[i]);
        }
        return time;
    }
}