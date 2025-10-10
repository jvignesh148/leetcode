class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int result=0;
        int[] dp=new int[energy.length];
        int sum=Integer.MIN_VALUE;
        for(int i=energy.length-1;i>=0;i--){
            dp[i]=energy[i]+(i+k<energy.length ? dp[i+k] : 0);
            sum=Math.max(sum,dp[i]);
        }
        return sum;
    }
}   