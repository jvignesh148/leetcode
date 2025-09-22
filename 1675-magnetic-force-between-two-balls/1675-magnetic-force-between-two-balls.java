class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int result=position[position.length-1]-position[0];
        int low=1,high=position[position.length-1]-position[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(position,m,mid)){
                result=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return result;
    }
    public boolean isPossible(int[] position, int m, int distance){
        int count=1;
        int last=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-last>=distance){
                count++;
                last=position[i];
            }
            if(count>=m) return true;
        }
        return false;
    }
}