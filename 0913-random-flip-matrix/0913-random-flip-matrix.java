class Solution {
    int m,n,total;
    Map<Integer,Integer> map;
    Random rand;
    public Solution(int m, int n) {
        this.m=m;
        this.n=n;
        this.map=new HashMap<>();
        this.total=m*n;
        this.rand=new Random();
    }
    
    public int[] flip() {
        int temp=rand.nextInt(total);
        total--;
        int x=map.getOrDefault(temp,temp);
        map.put(temp,map.getOrDefault(total,total));
        return new int[]{x/n,x%n};
    }
    
    public void reset() {
        map.clear();
        total=m*n;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */