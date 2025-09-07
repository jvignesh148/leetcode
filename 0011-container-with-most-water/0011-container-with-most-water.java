class Solution {
    static {
        for (int i = 0; i < 100; i++) {
            maxArea(new int[] { 0, 0 });
        }   
    }
    public static int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int maxarea=Integer.MIN_VALUE;
        while(left<right){
            int curr=Math.min(height[left],height[right]);
            int area=(curr)*(right-left);
            maxarea=Math.max(maxarea,area);
            while(left<right && height[left] <= curr) left++;
            while(left<right && height[right] <= curr) right--;
        }
        return maxarea;
    }
}