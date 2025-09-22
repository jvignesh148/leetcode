class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long low=1;
        long high=(long) Math.max(a,Math.max(b,c))*n;
        long result=0;
        while(low<=high){
            long mid=(low+(high-low)/2);
            if(check(mid,(long) a,(long) b,(long) c)>=n){
                result=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return (int)  result;
    }
    public long check(long mid, long a, long b, long c){
        long t1=lcm(a,b),t2=lcm(b,c),t3=lcm(a,c);
        long t=lcm(a,lcm(b,c));
        return (mid/a+mid/b+mid/c-mid/t1-mid/t2-mid/t3+mid/t);
    }
    public long lcm(long a, long b) { return a/gcd(a,b)*b; }
    public long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}