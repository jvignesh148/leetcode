class Solution {
    public String truncateSentence(String s, int k) {
        String[] st=s.split(" ");
        String str="";
        for(int i=0;i<k;i++){
            str=String.join(" ",str,st[i]);
        }
        return str.trim();
    }
}