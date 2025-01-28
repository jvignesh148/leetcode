class Solution {
    public String mergeAlternately(String word1, String word2) {
         String st="";
         if(word1.length()>word2.length()){
            int j=0;
             for(int i=0;i<word1.length();i++){
                st+=word1.charAt(i);
                if(j<word2.length()){
                    st+=word2.charAt(j);
                    j++;
                }
            }
         }
         else{
            int j=0;
             for(int i=0;i<word2.length();i++){
                if(j<word1.length()){
                    st+=word1.charAt(j);
                    j++;
                }
                st+=word2.charAt(i);
            }
         }
        return st;
    }
}