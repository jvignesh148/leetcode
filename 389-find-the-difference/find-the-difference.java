class Solution {
    public char findTheDifference(String s, String t) {
        int n=0,m=0;
        for(int i=0;i<s.length();i++){
            n+=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            m+=t.charAt(i);
        }
        return (char)(m-n);
    }
}