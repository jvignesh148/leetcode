class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(i<10){
                i=10;
                continue;
            }
            if(i>99 && i<1000) {
                i=1000;
                continue;
            }
            int div=(int) Math.pow(10,digitCount(i)/2);
            int l=i/div;
            int m=i%div;
            if(digitSum(l)==digitSum(m)) count+=1;
        }
        return count;
    }
    public static int digitCount(int n){
        return String.valueOf(n).length();
    }
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}