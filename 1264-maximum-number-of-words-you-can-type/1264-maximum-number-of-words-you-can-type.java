class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str=text.split("\\s+");
        int count=0;
        for(String s : str){
            for(char c : brokenLetters.toCharArray()){
                if(s.contains(String.valueOf(c))){
                    count++;
                    break;
                }
            }
        }
        return str.length-count;
    }
}