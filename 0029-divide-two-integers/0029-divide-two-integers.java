class Solution {
    public int divide(int dividend, int divisor) {
        long num=0;
        num=dividend/divisor;
        if(divisor==-1 && dividend==Integer.MIN_VALUE) return Integer.MAX_VALUE;
        if(num<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(num>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) num;
    }
}