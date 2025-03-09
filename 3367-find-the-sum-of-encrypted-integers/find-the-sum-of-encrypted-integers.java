class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int num : nums){
            sum+=greatElements(num);
        }
        return sum;
    }
    public static int greatElements(int n){
        int k=n%10;
        int temp=n;
        while(n>0){
            if(k<n%10) k=n%10;
            n/=10;
        }
        while(temp>0){
            n=(n*10)+k;
            temp/=10;
        }
        return n;
    }
}