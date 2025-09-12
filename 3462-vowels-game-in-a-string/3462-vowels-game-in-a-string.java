class Solution {
    public boolean doesAliceWin(String s) {
        int vowel=0;
        for(char c : s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') vowel++;
        }
        if(vowel==0) return false;
        else if(vowel%2==1) return true;
        else return true;
    }
}