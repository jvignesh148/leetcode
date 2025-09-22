class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low=1,high=piles[piles.length-1];
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(piles,h,mid)){
                result=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return result;
    }
    public boolean isPossible(int[] piles, int h, int speed){
        long count=0;
        for(int i=0;i<piles.length;i++){
            count+=(piles[i]+speed-1)/speed;
        }
        return count<=h;
    }
}