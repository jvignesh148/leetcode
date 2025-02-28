class Solution {
    public int balancedStringSplit(String s) {
        int count=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') c+=1;
            else c-=1;
            if(c==0) count+=1;
        }
        return count;
    }
}