class Solution {
    static{
        for(int i=0;i<500;i++) change(0,new int[] {1,1});
    }
    public static int change(int amount, int[] coins) {
        int[] dp=new int[amount+1];
        dp[0]=1;
        for(int coin : coins){
            for(int i=coin; i<=amount;i++){
                dp[i]+=dp[i-coin];
            }
        }
        return dp[amount];
    }
}