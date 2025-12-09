class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer,Long> map=new HashMap<>();
        for(int num : power){
            map.put(num,map.getOrDefault(num,0L)+num);
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list);
        long[] dp=new long[map.size()];
        dp[0]=map.get(list.get(0));
        for(int i=1;i<list.size();i++){
            int a=list.get(i);
            long val=map.get(a);
            int j=i-1;
            while(j>=0 && list.get(j)>=a-2) j--;
            val+=(j>=0)?dp[j]:0;
            dp[i]=Math.max(dp[i-1],val);
        }
        return dp[list.size()-1];
    }
}