class Solution {
    public long[] sumOfThree(long num) {
        long[] n=new long[3];
        if(num%3!=0) return new long[0];
        long k=num/3;
        n[0]=k-1;
        n[1]=k;
        n[2]=k+1;
        return n;
    }
}