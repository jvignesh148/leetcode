class Solution {
    public int pivotInteger(int n) {
        int s=n*(n+1)/2;
        int count=0;
        for(int i=1;i<=n;i++){
            count+=i;
            if(s==count) return i;
            s-=i;
        }
        return -1;
    }
}