class Solution {
    public int minOperations(int[] nums) {
        int ones = 0;
        for(int num : nums) if(num == 1) ones++;
        if(ones > 0) return nums.length-ones;
        int min=Integer.MAX_VALUE;
        for( int i = 0 ; i < nums.length - 1; i++) {
            int g=nums[i];
            for( int j = i+1; j < nums.length; j++) {
                g = gcd(g,nums[j]);
                if( g == 1) {
                    min=Math.min(min,j-i+1);
                    break;
                }
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return (min-1)+(nums.length-1);
    }
    public int gcd(int num1, int num2) {
        if(num2 == 0) return num1;
        return gcd(num2,num1%num2);
    }
}