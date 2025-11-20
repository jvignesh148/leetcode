class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        Map<Integer,Integer> f=new HashMap<>();
        TreeSet<int[]> s=new TreeSet<>((a,b)->a[0]==b[0]?b[1]-a[1]:b[0]-a[0]);
        for(int i=0;i<k;i++)add(nums[i],f,s);
        int[] ans=new int[n-k+1];
        ans[0]=(int)getSum(s,x);
        for(int i=k;i<n;i++){
            add(nums[i],f,s);
            remove(nums[i-k],f,s);
            ans[i-k+1]=(int)getSum(s,x);
        }
        return ans;
    }
    void add(int v,Map<Integer,Integer> f,TreeSet<int[]> s){
        if(f.containsKey(v))s.remove(new int[]{f.get(v),v});
        f.put(v,f.getOrDefault(v,0)+1);
        s.add(new int[]{f.get(v),v});
    }
    void remove(int v,Map<Integer,Integer> f,TreeSet<int[]> s){
        s.remove(new int[]{f.get(v),v});
        if(f.get(v)==1)f.remove(v);
        else{f.put(v,f.get(v)-1);s.add(new int[]{f.get(v),v});}
    }
    long getSum(TreeSet<int[]> s,int x){
        long t=0;int c=0;
        for(int[] p:s){t+=1L*p[0]*p[1];if(++c==x)break;}
        return t;
    }
}