class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1,high=10000000;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(solve(dist,mid,hour)) {
                result=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return result;
    }
    public boolean solve(int[] dist, int mid, double hour){
        double res=0.0;
        for(int i=0;i<dist.length-1;i++) {
            int num=dist[i];
            res+=Math.ceil((double) num/mid);
        }
        res+=(double) dist[dist.length-1]/mid;
        return res<=hour;
    }
}