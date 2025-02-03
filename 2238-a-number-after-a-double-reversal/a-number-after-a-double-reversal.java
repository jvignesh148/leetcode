class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num,n=0;
        while(temp!=0){
            n=(n*10)+temp%10;
            temp=temp/10;
        }
        temp=n;
        int sum=0;
        while(temp!=0){
            sum=(sum*10)+temp%10;
            temp=temp/10;
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}