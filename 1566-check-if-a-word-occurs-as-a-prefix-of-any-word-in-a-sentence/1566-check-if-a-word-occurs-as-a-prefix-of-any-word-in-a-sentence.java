class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] str=sentence.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].length()>=searchWord.length()){
                if(searchWord.equals(str[i].substring(0,searchWord.length()))) return i+1;
            }
        }
        return -1;
    }
}