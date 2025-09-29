class Solution {
    int m;
    Random rand;
    HashMap<Integer,Integer> map=new HashMap<>();
    public Solution(int n, int[] blacklist) {
        rand=new Random();
        m=n-blacklist.length;
        HashSet<Integer> set=new HashSet<>();
        for(int num : blacklist) set.add(num);
        Queue<Integer> q=new LinkedList<>();
        for(int i=m;i<n;i++){
            if(!set.contains(i)) q.offer(i);
        }
        for(int num : blacklist){
            if(num<m) map.put(num,q.poll());
        }
    }
    
    public int pick() {
        int res=rand.nextInt(m);
        return map.getOrDefault(res,res);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */