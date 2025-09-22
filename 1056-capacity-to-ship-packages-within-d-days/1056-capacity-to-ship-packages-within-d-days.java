class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0,sum=0;
        for(int num : weights) {
            sum+=num;
            max=Math.max(num,max);
        }
        int low=max,high=sum;
        int result=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(weights,mid,days)){
                result=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return result;
    }
    public boolean isPossible(int[] weights,int capacity,int days){
        int count=1,sum=0;
        for(int num : weights){
            if(sum+num>capacity){
                count++;
                sum=0;
            }
            sum+=num;
        }
        return count<=days;
    }
}