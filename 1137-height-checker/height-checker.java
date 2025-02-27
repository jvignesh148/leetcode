class Solution {
    public int heightChecker(int[] heights) {
        int[] h=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            h[i]=heights[i];
        }
        Arrays.sort(h);
        int count=0;
        for(int i=0;i<h.length;i++){
            if(h[i]!=heights[i]) count+=1;
        }
        return count;
    }
}