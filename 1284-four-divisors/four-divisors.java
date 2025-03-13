class Solution {
    public int sumFourDivisors(int[] nums) {
        int s=0;
        for(int num : nums){
            s+=divide(num);
        }
        return s;
    }
    public static int divide(int n){
        int sum=0,c=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                c+=1;
                if(i!=n/i){
                    sum+=n/i;
                    c+=1;
                }
            }
        }
        if(c==4) return sum;
        return 0;
    }
}