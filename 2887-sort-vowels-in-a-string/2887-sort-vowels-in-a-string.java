class Solution {
    public String sortVowels(String s) {
        List<Character> l=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(char c : s.toCharArray()) if("[aeiouAEIOU]".contains(String.valueOf(c))) l.add(c);
        Collections.sort(l);
        int i=0;
        for(char c : s.toCharArray()){
            if("[aeiouAEIOU]".contains(String.valueOf(c))) sb.append(l.get(i++));
            else sb.append(c);
        }
        return sb.toString();
    }
}