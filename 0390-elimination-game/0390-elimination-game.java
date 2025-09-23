class Solution {
    public int lastRemaining(int n) {
        int start=1,step=1,remain=n;
        boolean left=true;
        while(remain>1){
            if(left || remain%2==1) start+=step;
            remain/=2;
            step*=2;
            left=!left;
        }
        return start;
    }
}