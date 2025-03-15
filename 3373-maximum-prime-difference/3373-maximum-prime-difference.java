class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int st=0,la=nums.length-1;
        while(st<=la){
            if(!isPrime(nums[st])) st+=1;
            if(!isPrime(nums[la])) la-=1;
            if(isPrime(nums[st]) && isPrime(nums[la])) return Math.abs(st-la);
        }
        return 0;
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}