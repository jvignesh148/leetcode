class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int low=0,high=citations.length-1;
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(citations[mid]==citations.length-mid) return citations.length-mid;
            else if(citations[mid]<citations.length-mid) low=mid+1;
            else {
                result=citations.length-mid;
                high=mid-1;
            }
        }
        return result;
    }
}