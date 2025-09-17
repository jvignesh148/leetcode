class Solution {
    public int maxVowels(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++) sb.append(s.charAt(i));
        int count=countVowels(sb.toString());
        int maxCount=count;
        for(int i=k;i<s.length();i++){
            char t=s.charAt(i);
            char c=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(t);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') count--;
            if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u') count++;
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
    public int countVowels(String s){
        int count=0;
        for(char c : s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') count++;
        }
        return count;
    }
}