class Solution {
    public int longestString(int x, int y, int z) {
        int count=0;
        if(x!=y) count+=(Math.min(x,y)*4)+2;
        else count+=(Math.min(x,y)*4);
        count+=2*z;
        return count;
    }
}