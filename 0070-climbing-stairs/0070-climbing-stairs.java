class Solution {
    public int climbStairs(int n) {
        if(n<=1) return n;
        int[] dp=new int[n+2];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n+1;i++) dp[i]=dp[i-1]+dp[i-2];
        return dp[n+1];
    }
}
//Using Dynamic Programming Tabulation Approach
