class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0,s2=0;
        for(int num : nums) s1+=num;
        for(int num : nums){
            s2+=sumOfDigits(num);
        }
        return Math.abs(s2-s1);
    }
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}