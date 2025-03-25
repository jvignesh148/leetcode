class Solution {
    public boolean isThree(int n) {
        int count=1;
        for(int i=1;i<=(int) n/2;i++){
            if(n%i==0) count+=1;
        }
        if(count!=3) return false;
        return true;
    }
}