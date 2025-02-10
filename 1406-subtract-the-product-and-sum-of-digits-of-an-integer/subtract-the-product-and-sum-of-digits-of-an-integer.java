class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n,pd=1,sum=0;
        while(temp!=0){
            pd*=temp%10;
            sum+=temp%10;
            temp/=10;
        }
        return pd-sum;
    }
}