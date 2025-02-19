class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())) return true;
        else if(word.equals(word.toLowerCase())) return true;
        if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
            for(int i=1;i<word.length();i++){
                if(word.charAt(i)>='A' && word.charAt(i)<='Z') return false;
            }
            return true;
        }
        return false;
    }
}