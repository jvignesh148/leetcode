class Solution {
    public int maxProfit(int[] prices) {
        int max=0,min=Integer.MAX_VALUE;
        for(int i : prices){
           if(i<min) min=Math.min(i,min);
           else max=Math.max(max,i-min);
        }
        return max;
    }
}