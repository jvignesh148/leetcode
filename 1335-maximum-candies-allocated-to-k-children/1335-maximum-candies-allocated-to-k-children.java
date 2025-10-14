class Solution {
    public int maximumCandies(int[] candies, long k) {
        int result=0;
        int low=0,high=Integer.MIN_VALUE;
        for(int n : candies){
            high=Math.max(high,n);
        }
        while(low<=high){
            int mid=low+((high-low)>>1);
            boolean flag=solver(candies,mid,k);
            if(flag){
                result=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return result;
    }
    public boolean solver(int[] candies, int mid,long k){
        long sum=0;
        if(mid==0) return true;
        for(int n : candies){
            sum+=(n/mid);
        }
        return sum>=k;
    }
}