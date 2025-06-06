class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> l=new ArrayList<>();
        for(String word : words){
            if(word.length()==pattern.length() && match(pattern,word)) l.add(word);
        }
        return l;
    }
    public static boolean match(String pattern,String s){
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char w = s.charAt(i);
            char p = pattern.charAt(i);
            if (map1.containsKey(w) && map1.get(w) != p) return false;
            if (map2.containsKey(p) && map2.get(p) != w) return false;
            map1.put(w, p);
            map2.put(p, w);
        }
        return true;
    }
}