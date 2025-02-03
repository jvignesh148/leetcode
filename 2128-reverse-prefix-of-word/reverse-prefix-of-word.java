class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                ind=i;
                break;
            }
        }
        String str=word.substring(0,ind+1);
        StringBuilder sb=new StringBuilder(str);
        return word.replace(str,sb.reverse().toString());
    }
}