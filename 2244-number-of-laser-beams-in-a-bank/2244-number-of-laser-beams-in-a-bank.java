class Solution {
    public int numberOfBeams(String[] bank) {
        int res=0,old=0;
        for(String s : bank) {
            int temp=count(s);
            if(temp>0){
                res+=old*temp;
                old=temp;
            }
        }
        return res;
    }
    public static int count(String s){
        int co=0;
        for(char c : s.toCharArray()){
            if(c=='1') co++;
        }
        return co;
    }
}