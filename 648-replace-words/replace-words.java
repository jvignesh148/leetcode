class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] s=sentence.split(" ");
        String st="";
        for(String word : s){
            for(String ele : dictionary){
                if(word.startsWith(ele)) {
                    word=ele;
                }
            }
            st=String.join(" ",st,word);
        }
        return st.trim();
    }
}