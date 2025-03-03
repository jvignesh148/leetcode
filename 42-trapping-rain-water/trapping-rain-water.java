class Solution {
    public int trap(int[] height) {
        int result=0;
        int st=0,la=height.length-1;
        int lb=height[st];
        int rb=height[la];
         while(st<=la){
            if(lb<=rb){
                if(height[st]>lb) lb=height[st];
                else result+=lb-height[st];
                st+=1;
            }
            else{
                if(height[la]>rb) rb=height[la];
                else result+=rb-height[la];
                la-=1;
            }
        }
        return result;
    }
}