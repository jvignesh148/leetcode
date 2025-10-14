class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long result=0;
        int minTime=Integer.MAX_VALUE;
        for(int i : time) minTime=Math.min(minTime,i);
        long left=1,right=(long) minTime* (long) totalTrips;
        while(left<=right){
            long mid=left+((right-left)>>1);
            long check=solver(time,mid);
            if(check>=totalTrips){
                result=mid;
                right=mid-1;
            }
            else left=mid+1;
        }
        return result;
    }
    public long solver(int[] time, long minTime){
        long result=0;
        for(int num : time) result+=(minTime/num);
        return result;
    }
}