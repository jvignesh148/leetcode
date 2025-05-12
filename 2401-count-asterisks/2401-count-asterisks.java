class Solution {
    public int countAsterisks(String s) {
        int count=0,co=0;
        for(char c : s.toCharArray()){
            if(c=='|') co++;
            if(c=='*' && co%2==0) count++;
        }
        return count;
    }
}