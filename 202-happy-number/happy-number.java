class Solution {
    public boolean isHappy(int n) {
        int temp=n,r=0,a=0;
        while(temp!=0){
            a=temp%10;
            r+=(a*a);
            temp=temp/10;
        }
        Solution s=new Solution();
        if(r>=7){
            return s.isHappy(r);
        }
        if(r==1){
            return true;
        }
        return false;
    }
}